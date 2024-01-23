SELECT VoitureDefini.id_voituredefini,VoitureDefini.id_marque,marque.description as nomMarque,modele.description as nomModele 
FROM VoitureUtilisateur
JOIN VoitureDefini ON VoitureUtilisateur.id_voituredefini = VoitureDefini.id_voituredefini
JOIN marque ON VoitureDefini.id_marque = marque.id_marque
JOIN modele ON VoitureDefini.id_modele = modele.id_modele
GROUP BY VoitureDefini.id_voituredefini,VoitureDefini.id_marque,marque.description,modele.id_modele
ORDER BY COUNT(*) DESC
;

SELECT VoitureDefini.idvoituredefini,VoitureDefini.idmarque,marque.description as nommarque,modele.description as nommodele 
FROM VoitureUtilisateur
JOIN VoitureDefini ON VoitureUtilisateur.idvoituredefini = VoitureDefini.idvoituredefini
JOIN marque ON VoitureDefini.idmarque = marque.idmarque
JOIN modele ON VoitureDefini.idmodele = modele.idmodele
WHERE voitureutilisateur.statut=1 AND dateventefin >= '2023-03-19' AND dateventefin <= '2023-05-26' 
GROUP BY VoitureDefini.idvoituredefini,VoitureDefini.idmarque,marque.description,modele.idmodele
ORDER BY COUNT(*) DESC;


SELECT voitureutilisateur.*,marque.description as nommarque,modele.description as nommodele,
carburant.description as nomcarburant,puissance.kw,puissance.cv,boitedevitesse.description as nomboitedevitesse,
typedevehicule.description as nomtypedevehicule,voituredefini.nbrporte,voituredefini.puissance
FROM voitureutilisateur
JOIN voituredefini ON voituredefini.idvoituredefini = voitureutilisateur.idvoituredefini
JOIN marque ON voituredefini.idmarque = marque.idmarque
JOIN modele ON voituredefini.idmodele = modele.idmodele
JOIN carburant ON voituredefini.idcarburant = carburant.idcarburant
JOIN puissance ON voituredefini.idpuissance = puissance.idpuissance
JOIN boitedevitesse ON voituredefini.idboitedevitesse = boitedevitesse.idboiteDeVitesse
JOIN typedevehicule ON voituredefini.idtypedevehicule = typedevehicule.idtypedevehicule
;

SELECT *
FROM voitureutilisateur;


SELECT *
FROM voitureutilisateur WHERE kilometrage = ;

select * from voitureutilisateur_view join annonceFavoris on 
voitureutilisateur_view.idutilisateur = annonceFavoris.idutilisateur and voitureutilisateur_view.idvoitureUtilisateur = annonceFavoris.idvoitureUtilisateur
where annonceFavoris.idutilisateur = 4;


select * from voitureutilisateur_view where idutilisateur = 1;  --requete pour voir l`historique de ses recherches
select * from annonceFavoris_view where idutilisateur = 1;  --requete pour avoir ses annonces dans favoris

SELECT VoitureDefini.idvoituredefini,VoitureDefini.idmarque,marque.description as nommarque,modele.description as nommodele,COUNT(*) as nombre 
FROM VoitureUtilisateur
JOIN VoitureDefini ON VoitureUtilisateur.idvoituredefini = VoitureDefini.idvoituredefini
JOIN marque ON VoitureDefini.idmarque = marque.idmarque
JOIN modele ON VoitureDefini.idmodele = modele.idmodele
WHERE voitureutilisateur.statut=1 
GROUP BY VoitureDefini.idvoituredefini,VoitureDefini.idmarque,marque.description,modele.idmodele
ORDER BY COUNT(*) DESC




-- fonction
@GetMapping
    public ResponseEntity<List<ChatMessage>> getChatMessagesByRoomId(@RequestParam List<Integer> userIds, HttpServletRequest request) {
        if (appelerAutreService(request)) {
            List<ChatRoom> listChatRooms = chatRoomService.getChatRoomsByUserIds(userIds);
            System.out.println("taille=" + listChatRooms.size());

            String chatName = "chat";
            for (Integer i : userIds) {
                chatName = chatName + " user-" + i;
            }

            if (listChatRooms.size() > 0) {
                return ResponseEntity.ok(chatMessageService.getChatMessagesByRoomId(listChatRooms.get(0).getId()));
            }

            ChatRoom cr = chatRoomService.createChatRoom(new ChatRoom("", chatName, userIds));
            return ResponseEntity.ok(chatMessageService.getChatMessagesByRoomId(cr.getId()));
        }

        // Retourner une réponse avec un statut non autorisé (401) en cas de token non valide
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null);
    }