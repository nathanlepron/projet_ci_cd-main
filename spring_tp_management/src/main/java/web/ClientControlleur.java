package web;

@RestController
@RequestMapping("/clients")
public class ClientController {
    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/recherche")
    public List<Client> rechercherClients(@RequestParam("nom") String nom, @RequestParam("prenom") String prenom) {
        return clientService.rechercherClientsParNomEtPrenom(nom, prenom);
    }
}