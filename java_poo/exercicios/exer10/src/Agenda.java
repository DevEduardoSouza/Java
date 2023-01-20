public class Agenda implements UiAgenda{

    Contatos[] contato = new Contatos[5];
    private int indexC = 0;
    private boolean controle = false;



    @Override
    public void adiconar(Contatos c) {
        if(indexC < 3){
            contato[indexC] = c;
            indexC++;
            System.out.println("Contato adiconado com sucesso\n");
        }else{
            System.out.println("Não é possivel adicionar mais contatos\n");
        }
    }

    @Override
    public void remover(Contatos c) {
        for (int i = 0; i < contato.length; i++) {
            if(contato[i].equals(c)){
                contato[i] = null;
                controle = true;
            }
        }

        if(controle){
            System.out.println("Contato removido");
        }else{
            System.out.println("Contato não existe");
        }
    }

    @Override
    public void pesquisar(Contatos c) {
        
    }


    public void mostraTodosContatos(Contatos c) {

        for (Contatos x : contato) {
            System.out.printf("Nome: %s\nTelefone: %d\nEmail: %s\n", x.getNome(), x.getTelefone(), x.getEmail());
        }
        
    }
    
}
