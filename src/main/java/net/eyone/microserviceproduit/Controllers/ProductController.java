package net.eyone.microserviceproduit.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produits")
public class ProductController {
    @GetMapping("/liste")
    public String listeProduits(){
        return "la liste des produits";
    }

    @GetMapping("/{id}")
    public String detailProduit(@PathVariable int id){
        return "détail du produit " + id;
    }
}
