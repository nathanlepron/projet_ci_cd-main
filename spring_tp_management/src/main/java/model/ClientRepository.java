package model;

public interface ClientRepository extends JpaRepository<Client, Long> {
    List<Client> findByNomAndPrenom(String nom, String prenom);
}