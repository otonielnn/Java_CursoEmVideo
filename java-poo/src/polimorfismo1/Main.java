package polimorfismo1;

public class Main {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();

        m.setPeso(85.3f);
        m.setIdade(2);
        m.setMembros(4);
        m.locomover(); // Correndo
        m.alimentar(); // Mamando
        m.emitirSom(); // Som Mamifero

        c.setPeso(55.30f);
        c.setIdade(3);
        c.setMembros(4);
        c.locomover();
        c.alimentar();
        c.emitirSom();
        c.usarBolsa();

        k.setPeso(20.25f);
        k.setIdade(10);
        k.setMembros(4);
        k.locomover();
        k.alimentar();
        k.emitirSom();
        k.abanarRabo();
        k.enterrarOsso();

        // p.setPeso(0.35f);
        // p.setIdade(1);
        // p.setMembros(0);
        // p.locomover(); // Nadando
        // p.alimentar(); // Comendo substâncias
        // p.emitirSom(); // Peixe não faz som
        // p.soltarBolhar();

        // a.setPeso(0.89f);
        // a.setIdade(2);
        // a.setMembros(2);
        // a.locomover(); // voando
        // a.alimentar(); // Comendo frutas
        // a.emitirSom(); // Som de ave
        // a.fazerNinho();
    }
}
