public class App {
    // Interface para Reprodutor Musical
    interface ReprodutorMusical {
        void tocar();
        void pausar();
        void selecionarMusica(String musica);
    }

    // Interface para Aparelho Telefônico
    interface AparelhoTelefonico {
        void ligar(String numero);
        void atender();
        void iniciarConversaVoz();
    }

    // Interface para Navegador na Internet
    interface NavegadorInternet {
        void exibirPagina(String pagina);
        void adicionarNovaAba(String pagina);
        void atualizarPagina();
    }

    // Classe iPhone que implementa as interfaces
    public static class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
        @Override
        public void tocar() {
            System.out.println("Tocando música...");
        }

        @Override
        public void pausar() {
            System.out.println("Pausando música...");
            System.out.println("---------------------------------------------------------------");
        }

        @Override
        public void selecionarMusica(String musica) {
            System.out.println("Selecionando música: " + musica);
        }

        @Override
        public void ligar(String numero) {
            System.out.println("---------------------------------------------------------------");
            System.out.println("Ligando para " + numero);
        }

        @Override
        public void atender() {
            System.out.println("Atendendo chamada...");
        }

        @Override
        public void iniciarConversaVoz() {
            System.out.println("Iniciando conversa de voz...");
            System.out.println("---------------------------------------------------------------");
        }
        
        @Override
        public void exibirPagina(String pagina) {
            System.out.println("Exibindo página: " + pagina);
        }

        @Override
        public void adicionarNovaAba(String pagina) {
            System.out.println("Adicionando nova aba com página: " + pagina);
        }

        @Override
        public void atualizarPagina() {
            System.out.println("Atualizando página...");
            System.out.println("---------------------------------------------------------------");
        }
    }

    public static void main(String[] args) {
        // Criando uma instância de iPhone
        iPhone meuIPhone = new iPhone();

        // Testando os métodos do iPhone
        meuIPhone.ligar("123456789");
        meuIPhone.atender();
        meuIPhone.iniciarConversaVoz();

        meuIPhone.selecionarMusica("Shape of You");
        meuIPhone.tocar();
        meuIPhone.pausar();

        meuIPhone.exibirPagina("www.google.com");
        meuIPhone.adicionarNovaAba("www.facebook.com");
        meuIPhone.atualizarPagina();
    }
}
