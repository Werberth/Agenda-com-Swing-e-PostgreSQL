import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AtividadesCadastro {
	private JFrame frame;
	private static AtividadesCadastro tela;
	private JMenuBar menuBar;
	private JMenu opcoes;
	private JMenuItem sobre;
	private JMenuItem exit;

	private JButton salvar;
	private JLabel titulolabel, anotacaolabel, dialabel, meslabel, anolabel, atividadelabel;
	private JTextField  titulo;
	private JComboBox <String> dia, mes, ano;

	private JTextArea anotacao;
	private JScrollPane anotacaoScroll;


	public AtividadesCadastro(){
		montaTela();
	}

	private void montaTela(){
		frame = new JFrame("Agendar Tarefa");
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(new Color(0, 174, 176));
		initComponents();
		defineEvents();

		frame.pack();
		frame.setBounds(280,60,740,650);
		frame.setVisible(true);
	}

	private void initComponents(){
		//Declarações da barra de menu
		menuBar = new JMenuBar();
		menuBar.setBackground(new Color(0, 130, 156));
		opcoes = new JMenu("Opções");
		opcoes.setForeground(new Color(255, 255, 255));
		opcoes.setBackground(new Color(0, 130, 156));
		sobre = new JMenuItem("Sobre");
		sobre.setForeground(new Color(255, 255, 255));
		sobre.setBackground(new Color(0, 130, 156));
		exit = new JMenuItem("Exit");
		exit.setForeground(new Color(255, 255, 255));
		exit.setBackground(new Color(0, 130, 156));
		opcoes.add(sobre);
		opcoes.add(exit);
		menuBar.add(opcoes);
		frame.setJMenuBar(menuBar);;

		//Titulo da tela
		atividadelabel = new JLabel("Agendar Tarefa");
		atividadelabel.setForeground(new Color(255, 255, 255));
		atividadelabel.setFont(new Font("SansSerif", Font.BOLD, 30));
		atividadelabel.setBounds(100, 40, 550, 50);
		frame.add(atividadelabel);

		//Titulo da tarefa 
		titulolabel = new JLabel("Titulo da Tarefa");
		titulolabel.setForeground(new Color(255, 255, 255));
		titulo = new JTextField();
		titulo.setForeground(new Color(255, 255, 255));
		titulo.setBackground(new Color(0, 130, 156));
		titulolabel.setFont(new Font("SansSerif", Font.BOLD, 16));
		titulo.setFont(new Font("SansSerif", Font.BOLD, 15));
		titulolabel.setBounds(100,110,200,30);
		titulo.setBounds(100,140,550,30);
		frame.add(titulolabel);
		frame.add(titulo);

		String[] dia_string = { "Selecione","01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", 
								"14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26",
								"28", "29", "30", "31"};
		dia = new JComboBox<>(dia_string);
		dia.setBackground(new Color(0, 130, 156));
		dia.setForeground(new Color(255, 255, 255));
		dialabel = new JLabel("Dia: ");
		dialabel.setForeground(new Color(255, 255, 255));
		dialabel.setFont(new Font("SansSerif", Font.BOLD, 16));
		dialabel.setBounds(100, 180, 50, 30);
		dia.setBounds(150, 180, 100, 30);
		frame.add(dialabel);
		frame.add(dia);

		//JComboBox Mes
		String[] mes_string = { "Selecione", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"};
		mes = new JComboBox<>(mes_string);
		mes.setBackground(new Color(0, 130, 156));
		mes.setForeground(new Color(255, 255, 255));
		meslabel = new JLabel("Mes: ");
		meslabel.setForeground(new Color(255, 255, 255));
		meslabel.setFont(new Font("SansSerif", Font.BOLD, 16));
		meslabel.setBounds(260, 180, 100, 30);
		mes.setBounds(310, 180, 100, 30);
		frame.add(mes);
		frame.add(meslabel);

		//JComboBox Ano
		String[] ano_string = { "Selecione", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", 
								"2026", "2027", "2028", "2029", "2030"};
		ano = new JComboBox<>(ano_string);
		ano.setBackground(new Color(0, 130, 156));
		ano.setForeground(new Color(255, 255, 255));
		anolabel = new JLabel("Ano: ");
		anolabel.setForeground(new Color(255, 255, 255));
		anolabel.setFont(new Font("SansSerif", Font.BOLD, 16));
		anolabel.setBounds(420,180,100,30);
		ano.setBounds(470, 180, 100, 30);
		frame.add(ano);
		frame.add(anolabel);

		// Campo de texto Anotacao 
		anotacaolabel = new JLabel("Anotações");
		anotacaolabel.setForeground(new Color(255, 255, 255));
		anotacao = new JTextArea();
		anotacao.setForeground(new Color(255, 255, 255));
		anotacao.setBackground(new Color(0, 130, 156));
		anotacaolabel.setFont(new Font("SansSerif", Font.BOLD, 16));
		anotacao.setFont(new Font("SansSerif", Font.BOLD, 13));
		anotacaoScroll = new JScrollPane(anotacao);
		anotacaolabel.setBounds(100,240,200,30);
		anotacaoScroll.setBounds(100,270,550,250);
		frame.add(anotacaolabel);
		frame.add(anotacaoScroll);

		//Botão de Salvar 
		salvar = new JButton("Salvar");
		salvar.setFont(new Font("SansSerif", Font.BOLD, 15));
		salvar.setBackground(new Color(0, 130, 156));
		salvar.setForeground(new Color(255, 255, 255));
		salvar.setFont(new Font("SansSerif",1, 17));
		salvar.setBounds(550,530,100,40);
		frame.add(salvar);

	}


	private void defineEvents(){
		sobre.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				JOptionPane.showMessageDialog(null, "Agenda, Todos os Direitos Reservados, 2017.");
			}
		});

		exit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.exit(0);
			}
		});

	}

	public static void main(String[] args){
		tela = new AtividadesCadastro();
	}
}