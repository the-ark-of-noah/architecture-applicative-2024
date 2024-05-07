package fr.epsiflix.exposition.interaction.api.rest;

@RestController
@RequestMapping("/api/interaction")
public class InteractionController {

    private final InteractionService interactionService;

    public InteractionController(InteractionService interactionService) {
        this.interactionService = interactionService;
    }

    @PostMapping("/comment")
    public ResponseEntity<Void> postComment(@RequestBody CommentaireDto commentaireDto) {
        interactionService.postComment(commentaireDto);
        return ResponseEntity.ok().build();
    }

    // Autres méthodes API...
}
