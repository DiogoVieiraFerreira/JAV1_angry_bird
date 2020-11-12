package com.mygdx.game.providers;

import com.badlogic.gdx.math.MathUtils;
import com.mygdx.game.Tests.SemanticWordTest;
import com.mygdx.game.enums.Language;
import com.mygdx.game.models.SemanticWord;
import com.mygdx.game.models.Vocabulary;
import com.mygdx.game.models.Vocabulary;
import com.mygdx.game.models.Word;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class VocabularyProvider {
    private Language language1;// Language used to show the word to find
    private Language languageWantToLearn; // Language user want to learn
    static VocabularyProvider singleInstance = null;
    public ArrayList<Vocabulary> vocabularies;
    private Map<Language, String> languages;

    public static VocabularyProvider getInstance() {
        if (singleInstance == null)
            singleInstance = new VocabularyProvider();
        return singleInstance;
    }

    private VocabularyProvider() {
        SemanticWordTest.addTranslationTest();
        SemanticWordTest.getValueTest();
        vocabularies = new ArrayList<>();
        languages = new HashMap<>();

        createLanguages();
        createVocabularies();
    }

    public int totalOfVocabularies(){
        return vocabularies.size();
    }

    public Vocabulary pickVocabulary(int index) {
        return vocabularies.get(index);
    }

    public Vocabulary pickRandomVocabulary() {
        Vocabulary vocabulary;
        do{
            vocabulary = vocabularies.get(MathUtils.random(0, vocabularies.size() - 1));
        }while (vocabulary.countUnFoundSemanticWord() == 0); // we want a voc with unfound words
        return vocabulary;
    }
    
    private void createVocabularies() {
        SemanticWord semanticWord = new SemanticWord();
        Vocabulary vocabulary = new Vocabulary("L'argent");
        try {
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "la banque");
            semanticWord.addTranslation(Language.en, "the bank");
            semanticWord.addTranslation(Language.es, "el Banco");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "l''argent liquide");
            semanticWord.addTranslation(Language.en, "cash");
            semanticWord.addTranslation(Language.es, "efectivo");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "le paiement");
            semanticWord.addTranslation(Language.en, "payment");
            semanticWord.addTranslation(Language.es, "pago");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "un carnet de chèques");
            semanticWord.addTranslation(Language.en, "checkbook");
            semanticWord.addTranslation(Language.es, "talonario de cheques");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "déposer de l''argent");
            semanticWord.addTranslation(Language.en, "to deposit money");
            semanticWord.addTranslation(Language.es, "depositar dinero");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "prêter de l''argent");
            semanticWord.addTranslation(Language.en, "to borrow money");
            semanticWord.addTranslation(Language.es, "pedir dinero prestado");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "les services financiers");
            semanticWord.addTranslation(Language.en, "financial services");
            semanticWord.addTranslation(Language.es, "servicios financieros");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "la commission");
            semanticWord.addTranslation(Language.en, "commission");
            semanticWord.addTranslation(Language.es, "comisión");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "un investissement");
            semanticWord.addTranslation(Language.en, "an investment");
            semanticWord.addTranslation(Language.es, "una inversión");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "un virement");
            semanticWord.addTranslation(Language.en, "transfer");
            semanticWord.addTranslation(Language.es, "transferir");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "la gestion de l''argent");
            semanticWord.addTranslation(Language.en, "money management");
            semanticWord.addTranslation(Language.es, "administración del dinero");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "une transaction");
            semanticWord.addTranslation(Language.en, "a transaction");
            semanticWord.addTranslation(Language.es, "una transacción");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "un guichet automatique");
            semanticWord.addTranslation(Language.en, "ATM machine");
            semanticWord.addTranslation(Language.es, "cajero automático");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "attendre dans la queue");
            semanticWord.addTranslation(Language.en, "to wait in line");
            semanticWord.addTranslation(Language.es, "a esperar en línea");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "une carte bancaire");
            semanticWord.addTranslation(Language.en, "banking/ATM card");
            semanticWord.addTranslation(Language.es, "tarjeta bancaria / ATM");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "faire des économies");
            semanticWord.addTranslation(Language.en, "to save money");
            semanticWord.addTranslation(Language.es, "para ahorrar dinero");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "le montant");
            semanticWord.addTranslation(Language.en, "sum/total amount");
            semanticWord.addTranslation(Language.es, "suma / monto total");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "un compte-chèques");
            semanticWord.addTranslation(Language.en, "checking account");
            semanticWord.addTranslation(Language.es, "cuenta de cheques");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "l''argent");
            semanticWord.addTranslation(Language.en, "money");
            semanticWord.addTranslation(Language.es, "dinero");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "les fonds");
            semanticWord.addTranslation(Language.en, "funds");
            semanticWord.addTranslation(Language.es, "fondos");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "un chèque");
            semanticWord.addTranslation(Language.en, "check");
            semanticWord.addTranslation(Language.es, "cheque");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "un dépôt");
            semanticWord.addTranslation(Language.en, "deposit");
            semanticWord.addTranslation(Language.es, "depositar");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "le crédit");
            semanticWord.addTranslation(Language.en, "credit");
            semanticWord.addTranslation(Language.es, "crédito");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "les marchés financiers");
            semanticWord.addTranslation(Language.en, "financial markets");
            semanticWord.addTranslation(Language.es, "mercados financieros");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "la clientèle");
            semanticWord.addTranslation(Language.en, "clientele");
            semanticWord.addTranslation(Language.es, "clientela");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "les frais");
            semanticWord.addTranslation(Language.en, "fees");
            semanticWord.addTranslation(Language.es, "Tarifa");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "une institution financière");
            semanticWord.addTranslation(Language.en, "financial institution");
            semanticWord.addTranslation(Language.es, "institución financiera");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "le taux d''intérêt");
            semanticWord.addTranslation(Language.en, "interest rate");
            semanticWord.addTranslation(Language.es, "tasa de interés");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "la monnaie");
            semanticWord.addTranslation(Language.en, "currency");
            semanticWord.addTranslation(Language.es, "moneda");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "le bilan");
            semanticWord.addTranslation(Language.en, "balance");
            semanticWord.addTranslation(Language.es, "equilibrar");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "prendre un numéro");
            semanticWord.addTranslation(Language.en, "to take a number");
            semanticWord.addTranslation(Language.es, "tomar un número");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "une carte de crédit");
            semanticWord.addTranslation(Language.en, "credit card");
            semanticWord.addTranslation(Language.es, "tarjeta de crédito");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "un emprunt");
            semanticWord.addTranslation(Language.en, "a loan");
            semanticWord.addTranslation(Language.es, "un préstamo");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "retirer de l''argent");
            semanticWord.addTranslation(Language.en, "to take out money");
            semanticWord.addTranslation(Language.es, "sacar dinero");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "un compte d''épargne");
            semanticWord.addTranslation(Language.en, "savings account");
            semanticWord.addTranslation(Language.es, "cuenta de ahorros");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "un distributeur automatique");
            semanticWord.addTranslation(Language.en, "ATM machine");
            semanticWord.addTranslation(Language.es, "cajero automático");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "un reçu");
            semanticWord.addTranslation(Language.en, "receipt");
            semanticWord.addTranslation(Language.es, "recibo");
            vocabulary.addSemanticWord(semanticWord);
        } catch (Exception e) {

        }

         vocabularies.add(vocabulary);

        vocabulary = new Vocabulary("Les meubles");

        try {
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "une table");
            semanticWord.addTranslation(Language.en, "a table");
            semanticWord.addTranslation(Language.es, "una mesa");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "une chaise");
            semanticWord.addTranslation(Language.en, "a chair");
            semanticWord.addTranslation(Language.es, "una silla");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "une bibliothèque");
            semanticWord.addTranslation(Language.en, "a bookcase");
            semanticWord.addTranslation(Language.es, "una estantería");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "une table basse");
            semanticWord.addTranslation(Language.en, "a coffee table");
            semanticWord.addTranslation(Language.es, "una mesa para cafe");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "une cheminée");
            semanticWord.addTranslation(Language.en, "a fireplace");
            semanticWord.addTranslation(Language.es, "una chimenea");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "une table de chevet");
            semanticWord.addTranslation(Language.en, "a bedside table");
            semanticWord.addTranslation(Language.es, "una mesita de noche");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "une étagère");
            semanticWord.addTranslation(Language.en, "a shelf");
            semanticWord.addTranslation(Language.es, "un estante");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "une armoire");
            semanticWord.addTranslation(Language.en, "a wardrobe");
            semanticWord.addTranslation(Language.es, "un armario");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "une commode");
            semanticWord.addTranslation(Language.en, "a dresser");
            semanticWord.addTranslation(Language.es, "un vestidor");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "une moquette");
            semanticWord.addTranslation(Language.en, "a carpet");
            semanticWord.addTranslation(Language.es, "Una alfombra");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "un siège");
            semanticWord.addTranslation(Language.en, "a seat");
            semanticWord.addTranslation(Language.es, "un asiento");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "un tabouret");
            semanticWord.addTranslation(Language.en, "a stool");
            semanticWord.addTranslation(Language.es, "un taburete");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "un placard");
            semanticWord.addTranslation(Language.en, "a cupboard");
            semanticWord.addTranslation(Language.es, "un armario");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "un tiroir");
            semanticWord.addTranslation(Language.en, "a drawer");
            semanticWord.addTranslation(Language.es, "un cajon");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "un fauteuil");
            semanticWord.addTranslation(Language.en, "a armchair");
            semanticWord.addTranslation(Language.es, "un sillón");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "un lit");
            semanticWord.addTranslation(Language.en, "a bed");
            semanticWord.addTranslation(Language.es, "una cama");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "un bureau");
            semanticWord.addTranslation(Language.en, "a desk");
            semanticWord.addTranslation(Language.es, "un escritorio");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "un miroir");
            semanticWord.addTranslation(Language.en, "a mrror");
            semanticWord.addTranslation(Language.es, "un mrror");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "un meuble");
            semanticWord.addTranslation(Language.en, "a piece of furniture");
            semanticWord.addTranslation(Language.es, "un mueble");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "un oreiller");
            semanticWord.addTranslation(Language.en, "a pillow");
            semanticWord.addTranslation(Language.es, "una almohada");
            vocabulary.addSemanticWord(semanticWord);
        } catch (Exception e) {

        }
         vocabularies.add(vocabulary);

        vocabulary = new Vocabulary("Les couleurs");

        try {
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "blanc");
            semanticWord.addTranslation(Language.en, "white");
            semanticWord.addTranslation(Language.es, "blanco");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "bleu clair");
            semanticWord.addTranslation(Language.en, "light blue");
            semanticWord.addTranslation(Language.es, "azul claro");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "multicolore");
            semanticWord.addTranslation(Language.en, "muli-colored");
            semanticWord.addTranslation(Language.es, "multicolor");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "gris");
            semanticWord.addTranslation(Language.en, "grey");
            semanticWord.addTranslation(Language.es, "gris");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "vert");
            semanticWord.addTranslation(Language.en, "green");
            semanticWord.addTranslation(Language.es, "verde");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "noir");
            semanticWord.addTranslation(Language.en, "black");
            semanticWord.addTranslation(Language.es, "negro");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "argenté");
            semanticWord.addTranslation(Language.en, "silver");
            semanticWord.addTranslation(Language.es, "plata");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "jaune");
            semanticWord.addTranslation(Language.en, "yellow");
            semanticWord.addTranslation(Language.es, "amarillo");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "orange");
            semanticWord.addTranslation(Language.en, "orange");
            semanticWord.addTranslation(Language.es, "naranja");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "bleu");
            semanticWord.addTranslation(Language.en, "blue");
            semanticWord.addTranslation(Language.es, "azul");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "bleu foncé");
            semanticWord.addTranslation(Language.en, "dark blue");
            semanticWord.addTranslation(Language.es, "azul oscuro");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "rose");
            semanticWord.addTranslation(Language.en, "pink");
            semanticWord.addTranslation(Language.es, "rosado");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "rouge");
            semanticWord.addTranslation(Language.en, "red");
            semanticWord.addTranslation(Language.es, "rojo");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "marron");
            semanticWord.addTranslation(Language.en, "brown");
            semanticWord.addTranslation(Language.es, "marrón");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "violet");
            semanticWord.addTranslation(Language.en, "purple");
            semanticWord.addTranslation(Language.es, "púrpura");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "beige");
            semanticWord.addTranslation(Language.en, "beige");
            semanticWord.addTranslation(Language.es, "beige");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "turquoise");
            semanticWord.addTranslation(Language.en, "turquoise");
            semanticWord.addTranslation(Language.es, "turquesa");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "doré");
            semanticWord.addTranslation(Language.en, "golden");
            semanticWord.addTranslation(Language.es, "dorado");
            vocabulary.addSemanticWord(semanticWord);
        } catch (Exception e) {

        }
         vocabularies.add(vocabulary);

        vocabulary = new Vocabulary("La famille");

        try {
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "le père");
            semanticWord.addTranslation(Language.en, "the father");
            semanticWord.addTranslation(Language.es, "el padre");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "les parents");
            semanticWord.addTranslation(Language.en, "the parents");
            semanticWord.addTranslation(Language.es, "los padres");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "la sœur");
            semanticWord.addTranslation(Language.en, "the sister");
            semanticWord.addTranslation(Language.es, "la hermana");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "la fille");
            semanticWord.addTranslation(Language.en, "the daughter");
            semanticWord.addTranslation(Language.es, "la hija");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "le bébé");
            semanticWord.addTranslation(Language.en, "the baby");
            semanticWord.addTranslation(Language.es, "el bebé");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "la femme");
            semanticWord.addTranslation(Language.en, "the wife");
            semanticWord.addTranslation(Language.es, "La esposa");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "la fiancée");
            semanticWord.addTranslation(Language.en, "the fiancée");
            semanticWord.addTranslation(Language.es, "la prometida");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "la grand-mère");
            semanticWord.addTranslation(Language.en, "the grandmother");
            semanticWord.addTranslation(Language.es, "la abuela");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "les petits-enfants");
            semanticWord.addTranslation(Language.en, "the grandchildren");
            semanticWord.addTranslation(Language.es, "los nietos");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "la tante");
            semanticWord.addTranslation(Language.en, "the aunt");
            semanticWord.addTranslation(Language.es, "la tía");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "la nièce");
            semanticWord.addTranslation(Language.en, "the niece");
            semanticWord.addTranslation(Language.es, "la sobrina");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "la belle-mère");
            semanticWord.addTranslation(Language.en, "the step mother");
            semanticWord.addTranslation(Language.es, "La Madrastra");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "la cousine");
            semanticWord.addTranslation(Language.en, "the cousin (female)");
            semanticWord.addTranslation(Language.es, "la prima (mujer)");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "la belle-sœur");
            semanticWord.addTranslation(Language.en, "sister in-law");
            semanticWord.addTranslation(Language.es, "cuñada");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "la mère");
            semanticWord.addTranslation(Language.en, "the mother");
            semanticWord.addTranslation(Language.es, "La madre");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "le frère");
            semanticWord.addTranslation(Language.en, "the brother");
            semanticWord.addTranslation(Language.es, "el hermano");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "le fils");
            semanticWord.addTranslation(Language.en, "the son");
            semanticWord.addTranslation(Language.es, "el hijo");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "l’enfant");
            semanticWord.addTranslation(Language.en, "the child");
            semanticWord.addTranslation(Language.es, "el niño");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "le mari");
            semanticWord.addTranslation(Language.en, "the husband");
            semanticWord.addTranslation(Language.es, "el esposo");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "le fiancé");
            semanticWord.addTranslation(Language.en, "the fiancé");
            semanticWord.addTranslation(Language.es, "el prometido");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "le grand-père");
            semanticWord.addTranslation(Language.en, "the grandfather");
            semanticWord.addTranslation(Language.es, "el abuelo");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "les grand-parents");
            semanticWord.addTranslation(Language.en, "the grandparents");
            semanticWord.addTranslation(Language.es, "los abuelos");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "l’oncle");
            semanticWord.addTranslation(Language.en, "the uncle");
            semanticWord.addTranslation(Language.es, "el tío");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "le neveu");
            semanticWord.addTranslation(Language.en, "the nephew");
            semanticWord.addTranslation(Language.es, "el sobrino");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "le beau-père");
            semanticWord.addTranslation(Language.en, "the step father");
            semanticWord.addTranslation(Language.es, "el padrastro");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "le cousin");
            semanticWord.addTranslation(Language.en, "the cousin (male)");
            semanticWord.addTranslation(Language.es, "el primo (hombre)");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "le beau-frère");
            semanticWord.addTranslation(Language.en, "brother in-law");
            semanticWord.addTranslation(Language.es, "cuñado");
            vocabulary.addSemanticWord(semanticWord);
            semanticWord = new SemanticWord();
            semanticWord.addTranslation(Language.fr, "le beau-père");
            semanticWord.addTranslation(Language.en, "father in-law");
            semanticWord.addTranslation(Language.es, "suegro");
            vocabulary.addSemanticWord(semanticWord);
        } catch (Exception e) {

        }
         vocabularies.add(vocabulary);


    }

    private void createLanguages(){
        languages.put(Language.en,"Anglais");
        languages.put(Language.es,"Espagnol");
        languages.put(Language.fr,"Français");
    }

    public Map<Language, String> getMapLanguages() {
        return languages;
    }

    public Language findLanguage(String langue){
        for ( Map.Entry<Language,String> language : this.languages.entrySet()){
            if(language.getValue().equals(langue))
                return language.getKey();
        }
        return null;
    }
    public ArrayList<String> getLanguages() {
        ArrayList<String> languages = new ArrayList<>();

        for ( Map.Entry<Language,String> language : this.languages.entrySet()){
            languages.add(language.getValue());
        }

        return languages;
    }

    public String getLanguage(Language language) {
        return languages.get(language);
    }

    /**
     * Language used to show the word to find
     * @param language
     */
    public void setLanguage1(Language language) {
        language1 = language;
    }

    public Language getLanguage1() {
        return language1;
    }

    /**
     * Language user want to learn
     * @param language
     */
    public void setLanguageWantToLearn(Language language) {
        languageWantToLearn = language;
    }

    public Language getLanguageWantToLearn() {
        return languageWantToLearn;
    }

}
