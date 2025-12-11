package DiretorCMD;

public class ComandoLigarLuzes implements IComandoPalco {

    private final IluminacaoCenica receiver; // O Receiver

    public ComandoLigarLuzes(IluminacaoCenica receiver) {
        this.receiver = receiver;
    }

    @Override
    public String executar() {
        // Lança para o objeto afetado
        return receiver.ligarLuzes();
    }
}
