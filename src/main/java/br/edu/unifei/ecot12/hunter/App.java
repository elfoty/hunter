package br.edu.unifei.ecot12.hunter;

public class App {

	public static void main(String[] args) {
		
		Hunter h = new Hunter();
		h.setNome("Gon Freeccs");
		h.getNen().setTipoNen("Refor�o");
		Hunter h1 = new Hunter();
		h.setNome("Killua Zoldyck");
		h.getNen().setTipoNen("Transformacao");
		Hunter h2 = new Hunter();
		h.setNome("Kurapika Kurata");
		h.getNen().setTipoNen("Materialitiposzador");
		Hunter h3 = new Hunter();
		h.setNome("Leorio");
		h.getNen().setTipoNen("Refor�o");
		
		Faccao grupo = new Faccao();
		grupo.setNomeFaccao("Protagonistas");
		grupo.setIndole("boa");
		grupo.getPessoas().add(h);
		grupo.getPessoas().add(h1);
		grupo.getPessoas().add(h2);
		grupo.getPessoas().add(h3);
		
		Missao m = new Missao();
		m.setLocalizacao("Mundo");
		m.setObjetivo("Encontrar o pai do Gon");
		m.getHunters().add(h);
		m.getHunters().add(h1);
		m.getHunters().add(h2);
		m.getHunters().add(h3);
		
		Pessoa p = new Pessoa();
		p.setNome("Hisoka");
		Hunter h4 = new Hunter();
		h4.examehunter(p);
		
		Cozinheiro c = new Cozinheiro();
		c.setNome("Buhara");
		c.setEstrelas(0);
		c.setNivelPaladar(79);
		Receita r = new Receita();
		r.setNomeReceita("Porco assado");
		r.setDificuldade(7);
		c.getReceitas().add(r);
		
		
		Arqueologo a = new Arqueologo();
		a.setNome("Ging");
		a.setEstrelas(2);
		a.setDescricao("Dedicam a vida a descobrir, restaurar e preservar ru�nas e rel�quias.");
		Descoberta d = new Descoberta();
		d.setLocalizacao("Brasil");
		d.setDescricao("Ru�nas do Templo de Salom�o ??");
		a.getDescobertas().add(d);
		
		Medico me = new Medico();
		me.setNome("Cheadle");
		me.setAreaEspecializacao("Doen�as");
		me.setEstrelas(3);
				
		Musical mu = new Musical();
		mu.setNome("Melody");
		mu.getNen().setTipoNen("Emiss�o");
		mu.setNivelAudicao(100);
		mu.setDescricaoHabilidade("Aplica efeitos ao tocar sua flauta.");
		Instrumento i = new Instrumento();
		i.setNomeInstrumento("Flauta");
		mu.getInstrumentos().add(i);
		
		Treasure t = new Treasure();
		t.setNome("Biscuit Krueger");
		t.getNen().setTipoNen("Manipula��o e Transmuta��o");
		Tesouro te = new Tesouro();
		te.setLocalizacao("Greed Island");
		te.setGrauRaridade(10);
		te.setValor(10000000);
		t.getTesouros().add(te);
		
		Blacklist b = new Blacklist();
		b.setNome("Kurapika");
		b.setNumMortos(1);
		b.setEstrelas(0);
		b.setNumIdentificacaoAlvo("10002.102220.1123");
		Hunter alvo = new Hunter();
		alvo.setNumeroIdentificacao("10002.102220.1123");
		Hunter suspeito = new Hunter();
		suspeito.setNumeroIdentificacao("10002.102220.1123");
		b.verificarAlvo(alvo, suspeito);
		
		Associacao as = new Associacao();
		as.getZodiacos().add(me);
		
		
		Procurados pr = new Procurados();
		pr.getProcurados().add(alvo);

	}

}
