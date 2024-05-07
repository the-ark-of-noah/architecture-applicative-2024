package fr.espiflix.infrastructure.repository;

// Ce fichier sera utilisé pour définir les rôles des utilisateurs de l'application
// Passe du Bean Service Spring pour être injecté dans les classes qui en ont besoin

@Service("authorities")
public class Authorities {
    public static final String ADMIN = "ROLE_ADMIN";
    public static final String USER = "ROLE_USER";

    public boolean hasViewPrivileges(Authentication auth) {
        return auth.getAuthorities().stream()
                .map(GrantedAuthority::getAuthority)
                .anyMatch(Set.of(ADMIN, USER)::contains);
    }

    public boolean hasManagePrivileges(Authentication auth) {
        return auth.getAuthorities().stream()
                .map(GrantedAuthority::getAuthority)
                .anyMatch(Set.of(ADMIN)::contains);
    }
//    ...
}