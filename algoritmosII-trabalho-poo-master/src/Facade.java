public class Facade {
Certificado certificado;
Palestras palestras;
Evento evento;
public void inicia(){
    this.evento = new Evento();
    this.certificado = new Certificado();
    this.palestras = new Palestras();
}
}
