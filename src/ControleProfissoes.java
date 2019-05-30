
public class ControleProfissoes {

	public static void main(String[] args) {
		Medico mdc = new Medico();
		mdc.setNome("Regina Duarte");
		mdc.setIdade(42);
		mdc.setCpf("123.456.789-00");
		mdc.setSalario(12.000);
		mdc.setCrm("12.34567-0");
		mdc.endereco=new Endereco();
		mdc.endereco.setRua("Rua Senador Vergueiro");
		mdc.endereco.setNumero(230);
		mdc.endereco.setComplemento("Apto. 701");
		mdc.endereco.setBairro("Flamengo");
		mdc.endereco.setCidade("Rio de Janeiro");
		mdc.endereco.setEstado("Rio deJaneiro");
		mdc.endereco.setCep("22230-001");
		System.out.println("Médico");
		System.out.println("nome" + mdc. getNome() + "idade" + mdc. getIdade() + "cpf" + mdc. getCpf() + "salario" + mdc. getSalario() + "crm" + mdc. getCrm());
		
		
		

	}

}
