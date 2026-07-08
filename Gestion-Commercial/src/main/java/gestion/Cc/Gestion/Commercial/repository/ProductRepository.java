package gestion.Cc.Gestion.Commercial.repository;

import gestion.Cc.Gestion.Commercial.model.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProduitRepository extends JpaRepository<Produit, Long> {
    // Méthodes personnalisées si nécessaire
}