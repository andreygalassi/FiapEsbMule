package convertecep;

public class CepResponse {
	
	private Integer id;
	private String end;
	private String cep;
	private String bairro;
	private String cidade;
	private String uf;
	private String complemento;
	private String complemento2;
	private String dataConsulta;
	
	public String getDataConsulta() {
		return dataConsulta;
	}
	public void setDataConsulta(String dataConsulta) {
		this.dataConsulta = dataConsulta;
	}
	public String getOrigemConsulta() {
		return origemConsulta;
	}
	public void setOrigemConsulta(String origemConsulta) {
		this.origemConsulta = origemConsulta;
	}
	private String origemConsulta;
	
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getComplemento2() {
		return complemento2;
	}
	public void setComplemento2(String complemento2) {
		this.complemento2 = complemento2;
	}
	public String getEnd() {
		return end;
	}
	public void setEnd(String end) {
		this.end = end;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}	

}
