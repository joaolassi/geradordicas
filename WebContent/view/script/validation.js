var titulo = document.getElementById("titulo");
var subTitulo = document.getElementById("subTitulo");
var autor = document.getElementById("autor");
var dica = document.getElementById("dica");
var submit = document.getElementById("submit");

function validar(){
	
if(titulo.value == ""){
	alert('Digite o título!')
	event.preventDefault();
	return false;
}else if(subTitulo.value == ""){
	alert('Digite subtítulo')
	event.preventDefault();
	return false;
}else if(autor.value == ""){
	alert('Digite o nome do Autor')
	event.preventDefault();
	return false;
}else if(dica.value == ""){
	alert('Digite a dica')
	event.preventDefault();
	return false;
}

}