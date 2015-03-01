create table doador (
	idDoador				INTEGER AUTO_INCREMENT PRIMARY KEY,
	nome						VARCHAR(150) NOT NULL,
	nomePai					VARCHAR(150) NOT NULL,
	nomeMae					VARCHAR(150) NOT NULL,
	sexo						VARCHAR(1) NOT NULL,
	estadoCivil			VARCHAR(20) NOT NULL,
	dataNascimento	DATE NOT NULL,
	nacionalidade		VARCHAR(150) NOT NULL,
	tipoDoc					VARCHAR(5) NOT NULL,
	numDoc					VARCHAR(20) NOT NULL,
	orgaoExp				VARCHAR(5) NOT NULL,
	rua						 	VARCHAR(150) NOT NULL,
	numero					INTEGER NOT NULL,
	municipio				VARCHAR(50) NOT NULL,
	UF						 	VARCHAR(2) NOT NULL,
	tel						 	VARCHAR(15) NOT NULL,
	escolaridade		VARCHAR(150) NOT NULL,
	profissao				VARCHAR(150) NOT NULL,
	bairro					VARCHAR(100) NOT NULL,
	complemento			VARCHAR(50) NOT NULL,
	CEP						 	VARCHAR(7) NOT NULL
);

create table doacao (
	idDoacao 			INTEGER AUTO_INCREMENT PRIMARY KEY,
	tipo					VARCHAR(100) NOT NULL,
	nome					VARCHAR(150) NOT NULL,
	nomeHospital	VARCHAR(150) NOT NULL,
	procedimento	VARCHAR(50)  NOT NULL,
	responsavel		VARCHAR(150) NOT NULL,
	idDoador			INTEGER NOT NULL,
	CONSTRAINT fk_doacao_doador  REFERENCES doador(idDoador),
);

create table exame (
	idExame 							INTEGER AUTO_INCREMENT PRIMARY KEY,
	pesoAtual							FLOAT(5,2) NOT NULL,
	hematocrito						INTEGER NOT NULL,
	pulso									SMALLINT NOT NULL,
	temperatura						FLOAT(3,1) NOT NULL,
	pressaoArterial				VARCHAR(10) NOT NULL,
	codInaptoDefinitivo		, --QUE ISSO?
	codInaptoTemporario		, --QUE ISSO?
	periodoInaptidao			, --QUE ISSO?
	triador								, --PRA QUE ISSO?
	codTriador						, --DE ONDE VEM ISSO?
	reacoesAdversas				TEXT NOT NULL,
	descricaoReacao				TEXT NOT NULL,
	idDoacao							INTEGER NOT NULL,
	CONSTRAINT fk_exame_doacao REFERENCES doacao(idDoacao)
);