interface InteractionRepository {
    void addInteraction(Interaction interaction);
    void updateInteraction(Interaction interaction);
    void deleteInteraction(UniqueId interactionId);
    Interaction getInteractionDetails(UniqueId interactionId);
}