package livropacote2;

 class ExtLivro extends livropacote.Livro{
	 private String autor;

	public ExtLivro(String t, String a, int d, String b) {
		// TODO Auto-generated constructor stub
		super(t, a, d);
		autor = b;
	}

	public void show()
	{
		System.out.println(titulo);
		System.out.println(autor);
		System.out.println(pubData);
		System.out.println();
	}
	
	public String getAutor()
	{
		return autor;
	}
	public void setAutor(String p)
	{
		autor = p;
	}
	public String getTitulo()
	{
		return titulo;
	}
	public void setTitulo(String t)
	{
		titulo = t;
	}
}
