package tn.esprit.crud_forum.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.crud_forum.entities.Publication;
import tn.esprit.crud_forum.services.IPublication;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Publication")
public class PublicationRestController {
    IPublication publicationService;
   //Afficher les pubs
    @GetMapping("/retrieve-all-publication")
    public List<Publication> getPublications() {
        List<Publication> publicationList = publicationService.retrieveAllPublication();
        return publicationList;
    }
 //
    @GetMapping("/retrieve-publication/{publication-id}")
    public Publication retrievePublication(@PathVariable("publication-id") Integer idPub) {
        return publicationService.retrievePublication(idPub);
    }

  //Ajouter pub
    @PostMapping("/add-publication")
    public Publication addPublication(@RequestBody Publication p) {
        Publication publication = publicationService.addPublication(p);
        return publication;
    }

    // supprimer pub
    @DeleteMapping("/remove-Publication/{publication}")
    public void deletePublication(@PathVariable("publication") Integer idPub) {
        publicationService.deletePublication(idPub);
    }

//Modifier
   @PutMapping("/update-Publication")
    public Publication updatePublication(@RequestBody Publication p) {
        Publication publication= publicationService.updatePublication(p);
        return publication;
    }

}
