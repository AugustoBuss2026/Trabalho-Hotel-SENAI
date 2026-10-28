import javafx.fxml.FXML;

public class HotelController {
    private Cadastro cadastro;
    private Reserva reserva;
    private Consulta consulta;
    private Manutencao manutencao;
    private CancelarReservas cancelarReserva;
    private ListaNegraEDividas listaNegraDividas;
    private CheckIN checkIn;
    private CheckOUT checkOut;

    @FXML
    private void initialize() {
        cadastro = new Cadastro();
        reserva = new Reserva(cadastro);
        consulta = new Consulta(cadastro);
        manutencao = new Manutencao(cadastro);
        cancelarReserva = new CancelarReservas(cadastro);
        listaNegraDividas = new ListaNegraEDividas(cadastro);
        checkIn = new CheckIN(cadastro);
        checkOut = new CheckOUT(cadastro);
    }

    @FXML
    private void cadastrarHospede() {
        cadastro.cadastroCliente();
    }
    @FXML
    private void cadastrarQuarto() {
        cadastro.cadastroQuarto();
    }
    @FXML
    private void reservarQuarto() {
        reserva.reservarQuarto();
    }
    @FXML
    private void consultarHospedes() {
        consulta.ConsultaCliente();
    }
    @FXML
    private void consultarQuartos() {
        consulta.ConsultaQuarto();
    }
    @FXML
    private void cancelarReserva() {
        cancelarReserva.CR();
    }
    @FXML
    private void repararQuarto() {
        manutencao.reparo();
    }
    @FXML
    private void danificarQuarto() {
        manutencao.estrago();
    }
    @FXML
    private void gerenciarListaNegra() {
        listaNegraDividas.ListaNegra();
    }
    @FXML
    private void gerenciarDividas() {
        listaNegraDividas.Divida();
    }
    @FXML
    private void fazerCheckIn() {
        checkIn.CheckIn();
    }
    @FXML
    private void fazerCheckOut() {
        checkOut.CheckOut();
    }
}
