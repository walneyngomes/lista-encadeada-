import java.util.Scanner;

public class ListaEncadeada {
	No proximo;

	public void add(No valorNo) {
		if (this.proximo == null) {
			proximo = valorNo;
		} else {
			add(valorNo);
		}
	}

	private void addValor(No valor) {
		No pos = this.proximo;
		while (pos != null) {
			pos = pos.proximo;
		}
		pos = pos.proximo = proximo;
	}

	public No buscarNome(String nome, String dado) {
		No indo = this.proximo;

		No valor = null;
		while (indo != null) {
			if (indo.nome.equals(nome)) {
				valor = indo;
				break;
			} else {
				indo = indo.proximo;
			}
		}
		if (valor == null) {
			System.out.println("O nome nao existe");
			System.out.println("quer criar?");
			Scanner teclado = new Scanner(System.in);
			dado = teclado.nextLine();
			if (dado.equals("1")) {
				No val = new No();
				val.nome = nome;
				this.addValor(val);
			}
		}
		return valor;

	}

	public boolean modificarNoNome(String nome) {
		No indo = this.proximo;
		while (indo != null) {
			if (indo.nome.equals(nome)) {
				valor = indo;
				break;
			} else {
				indo = indo.proximo;
			}
		}
	}

}
