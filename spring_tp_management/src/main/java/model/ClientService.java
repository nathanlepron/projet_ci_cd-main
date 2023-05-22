package model;

@Service
public class ClientService {
    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public List<Client> rechercherClientsParNomEtPrenom(String nom, String prenom) {
        return clientRepository.findByNomAndPrenom(nom, prenom);
    }
}