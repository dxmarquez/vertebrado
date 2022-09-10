public class GeneradorVertebrados {
    public static Vertebrado[] generarArrayVertebrados(){
        Vertebrado[] miVertebrados = new Vertebrado[4];
        miVertebrados[0] = new Vertebrado("Came-llo", "Mamifero"); 
        miVertebrados[1] = new Vertebrado("Va-ca", "Mamifero");
        miVertebrados[2] = new Vertebrado("Tib-urón", "Pez"); 
        
        return miVertebrados;
    }
}
