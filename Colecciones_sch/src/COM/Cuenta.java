package COM;

public class Cuenta {
	
	double saldoDisponible;
	String usuario; 
	String numeroCuenta;
	String clave;
	String tipo;
	
	
	public static double SALDO_MAX = 0.0;
	public static double SALDO_MIN = 0.0;
	
	public Cuenta() {
		
	}

	public Cuenta(double saldoDisponible, String usuario, String numeroCuenta, String clave, String tipo) {
		this.saldoDisponible = saldoDisponible;
		this.usuario = usuario;
		this.numeroCuenta = numeroCuenta;
		this.clave = clave;
		this.tipo = tipo;
	}

	public double getSaldoDisponible() {
		return saldoDisponible;
	}

	public void setSaldoDisponible(double saldoDisponible) {
		this.saldoDisponible = saldoDisponible;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public static double getSALDO_MAX() {
		return SALDO_MAX;
	}

	public static void setSALDO_MAX(double sALDO_MAX) {
		SALDO_MAX = sALDO_MAX;
	}

	public static double getSALDO_MIN() {
		return SALDO_MIN;
	}

	public static void setSALDO_MIN(double sALDO_MIN) {
		SALDO_MIN = sALDO_MIN;
	}

	@Override
	public String toString() {
		return "Cuenta [saldoDisponible=" + saldoDisponible + ", usuario=" + usuario + ", numeroCuenta=" + numeroCuenta
				+ ", clave=" + clave + ", tipo=" + tipo + "]";
	}

	
	
	
	
	
	
	
}
