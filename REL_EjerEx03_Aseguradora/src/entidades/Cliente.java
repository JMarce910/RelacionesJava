
package entidades;

/**
 *
 * @author Pc
 */
public class Cliente {
    
  private String nombreApellido;
        private String documento;
        private String mail;
        private String domicilio;
        private String telefono;

    public Cliente() {
    }

    public Cliente(String nombreApellido, String documento, String mail, String domicilio, String telefono) {
        this.nombreApellido = nombreApellido;
        this.documento = documento;
        this.mail = mail;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombreApellido=" + nombreApellido + ", documento=" + documento + ", mail=" + mail + ", domicilio=" + domicilio + ", telefono=" + telefono + '}';
    }  
    
}
