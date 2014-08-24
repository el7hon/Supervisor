function clickk(i) {
	if (i==1){
			document.location.href="load.html";	
	} else {
		document.getElementById("texto").innerHTML="Not developed.";	
	}
}

function loadModel() {
	document.load_form.submit();
}

function alerta() { alert("opa!"); }


function callPlugin() { cordova.exec(
	function(parametro){ alert("deu certo"); },
	function(parametro){ alert("deu errado"); },
	"Servico1","teste",["elthon","allex",31]);
}

function getI() { cordova.exec(
	function(parametro){
		alert("- " + parametro.uuid + " " + parametro.versio + " " + parametro.platfotm + " " + parametro.model);
	},
	function(parametro){ alert("deu errado"); },
	"Device","getDeviceInfo",[]);
}
