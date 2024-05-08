public class ConcatenandoNome {
 
    public static void main(String[] args) {
                
        String primeiroNome = "Julio";
        String segundoNome = "Cesar";

        String nomecompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomecompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Resultado do metodo: " + primeiroNome.concat(" ").concat(segundoNome);

    }
}

