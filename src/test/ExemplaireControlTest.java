package Test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import Domaine.Exemplaire;
import Domaine.Oeuvre;
import Utility.BibliothequeExceptions;
import control.ExemplaireControl;

public class ExemplaireControlTest {

    @Test
    public void testAjouter() throws BibliothequeExceptions {
        Oeuvre oeuvre = new Oeuvre();
        oeuvre.setId(1);
        oeuvre.setTitre("Les Mis�rables");
        oeuvre.setAuteur("Victor Hugo");
        oeuvre.setNbExemplaires(0);
        ExemplaireControl.ajouter(oeuvre, "neuf");
        assertEquals(1, oeuvre.getNbExemplaires());
    }

    @Test
    public void testModifier() throws BibliothequeExceptions {
        Exemplaire exemplaire = new Exemplaire();
        exemplaire.setId(1);
        exemplaire.setEtat("abim�");
        ExemplaireControl.modifier(exemplaire);
        assertEquals("abim�", exemplaire.getEtat());
    }

    @Test
    public void testSupprimer() throws BibliothequeExceptions {
        Exemplaire exemplaire = new Exemplaire();
        exemplaire.setId(1);
        exemplaire.setEtat("neuf");
        ExemplaireControl.supprimer(exemplaire);
        assertNull(ExemplaireControl.findById(1));
    }

    @Test
    public void testFindById() throws BibliothequeExceptions {
        Exemplaire exemplaire = ExemplaireControl.findById(1);
        assertNotNull(exemplaire);
    }

    @Test
    public void testFindExemplaireDispo() throws BibliothequeExceptions {
        Oeuvre oeuvre = new Oeuvre();
        oeuvre.setId(1);
        ArrayList<Exemplaire> exemplairesDispo = ExemplaireControl.findExemplaireDispo(oeuvre);
        assertNotNull(exemplairesDispo);
    }

    @Test
    public void testFind() throws BibliothequeExceptions {
        Oeuvre oeuvre = new Oeuvre();
        oeuvre.setId(1);
        ArrayList<Exemplaire> exemplaires = ExemplaireControl.find(oeuvre);
        assertNotNull(exemplaires);
    }
    /*
     * Ce test effectue les op�rations suivantes :

Teste la m�thode "ajouter" en ajoutant un exemplaire � une oeuvre et en v�rifiant que le nombre d'exemplaires de l'oeuvre a bien �t� incr�ment�.
Teste la m�thode "modifier" en modifiant l'�tat d'un exemplaire et en v�rifiant que l'�tat a bien �t� modifi�.
Teste la m�thode "supprimer" en supprimant un exemplaire et en v�rifiant qu'il n'est plus possible de le retrouver avec la m�thode "findById".
Teste la m�thode "findById" en cherchant un exemplaire existant et en v�rifiant qu'il est bien retourn�.
Teste la m�thode "findExemplaireDispo" en cherchant des exemplaires disponibles pour une oeuvre donn�e et en v�rifiant qu'ils sont bien retourn�s.
Teste la m�thode "find" en cherchant tous les exemplaires pour une oeuvre donn�e et en v�rifiant qu'ils sont bien retourn�s.      */

}
