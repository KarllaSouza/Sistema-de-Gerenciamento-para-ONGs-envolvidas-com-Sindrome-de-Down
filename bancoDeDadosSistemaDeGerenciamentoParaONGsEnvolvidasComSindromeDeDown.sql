--
-- Database: `tric21`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `atividades`
--

DROP TABLE IF EXISTS `atividades`;
CREATE TABLE `atividades` (
  `id_atividade` int(5) NOT NULL,
  `descricao_atividade` varchar(60) NOT NULL,
  `horario_atividade` datetime NOT NULL,
  `responsavel_atividade` varchar(30) NOT NULL,
  `material_para_atividade` varchar(60) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


-- --------------------------------------------------------

--
-- Estrutura da tabela `colaborador`
--

DROP TABLE IF EXISTS `colaborador`;
CREATE TABLE `colaborador` (
  `id_colaborador` int(6) NOT NULL COMMENT 'código de identificação do colaborador',
  `nome_colaborador` varchar(40) NOT NULL COMMENT 'nome do colaborador',
  `cpf_colaborador` varchar(19) NOT NULL,
  `email_colaborador` varchar(40) NOT NULL,
  `Telefone` varchar(10) NOT NULL COMMENT 'número de telefone para contato',
  `empresa_associada` tinyint(1) NOT NULL COMMENT 'indica se a empresa é associada ou não com a ONG',
  `endereco_colaborador` varchar(50) NOT NULL COMMENT 'salva o endereço do colaborador'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `colaborador`
--

INSERT INTO `colaborador` (`id_colaborador`, `nome_colaborador`, `cpf_colaborador`, `email_colaborador`, `Telefone`, `empresa_associada`, `endereco_colaborador`) VALUES
(3, 'Diogo Figueredo', '123.456.789-01', 'diogofb.93@hotmail.com', '998010348', 0, 'Ponta Verde - Maceió / AL'),
(5, 'Diego Henrique Melo', '986.356.345-60', 'diegomelo.90@hotmail.com', '981905902', 1, 'Maceió/AL'),
(6, 'João Pedro Ramos Pradines', '111.222.333-44', 'pradines_jp@gmail.com', '99327-2042', 0, 'Maceió'),
(7, 'Alexandre Henrique Cavalcanti', '222.444.555-33', 'ahc_@hotmail.com', '99676-0771', 0, 'Maceió'),
(8, 'Raylan Medeiros', '000.999.888-77', 'raylanmedeiros@email.com', '999368273', '1', 'Campo Alegre');



-- --------------------------------------------------------

--
-- Estrutura da tabela `despesas`
--

DROP TABLE IF EXISTS `despesas`;
CREATE TABLE `despesas` (
  `cod_despesa` int(5) NOT NULL,
  `descricao` varchar(40) NOT NULL,
  `valor` double NOT NULL,
  `data_vencimento_despesa` date NOT NULL,
  `data_pagamento_despesa` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `doacao`
--

INSERT INTO despesas (cod_despesa, descricao, valor, data_vencimento_despesa, data_pagamento_despesa) VALUES ('1', 'Recursos Humanos', '51.638,41', '2016-07-23', '2016-07-23'), ('2', 'Alimentação', '293,69', '2016-06-25', '2016-06-23'), ('3', 'Manutenção/sede', '7.583,89', '2016-06-30', ''), ('4', 'Transportes', '6.915,00', '2016-07-02', ''), ('5', 'Saúde', '4.187,35', '2016-06-28', ''), ('6', 'Atividades', '4.459,67', '2016-07-07', '');


-- --------------------------------------------------------

--
-- Estrutura da tabela `doacao`
--

DROP TABLE IF EXISTS `doacao`;

CREATE TABLE `doacao` (
  `id_doacao` int(11) NOT NULL COMMENT 'identificador da doação',
  `id_colaborador` int(11) DEFAULT NULL COMMENT 'identificação do colaborador',
  `moeda_doacao` varchar(3) NOT NULL COMMENT 'moeda utilizada na doação. Ex.: R$, US$, etc',
  `valor_doacao` double NOT NULL COMMENT 'valor que foi doado',
  `data_doacao` date NOT NULL COMMENT 'data da doação'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `doacao`
--

INSERT INTO `doacao` (`id_doacao`, `id_colaborador`, `moeda_doacao`, `valor_doacao`, `data_doacao`) VALUES
(1, NULL, 'R$', 964, '2016-05-11'),
(2, NULL, 'R$', 568, '2016-04-29'),
(3, NULL, 'R$', 568, '2016-04-29'),
(4, NULL, 'R$', 876, '2016-05-24'),
(5, NULL, 'R$', 2.6, '2016-06-24'),
(6, 4, 'R$', 647, '2016-06-06'),
(7, 7, 'R$', 675, '2016-06-06'),
(8, 5, 'R$', 385, '2016-06-03'),
(9, 6, 'R$', 2.457, '2016-06-03');

--
-- Indexes for dumped tables
--
--
-- Indexes for table `doacao`
--
ALTER TABLE `doacao`
  ADD PRIMARY KEY (`id_doacao`);
--
-- AUTO_INCREMENT for dumped tables
-- 
AUTO_INCREMENT for table `doacao`
--
ALTER TABLE `doacao`
  MODIFY `id_doacao` int(11) NOT NULL AUTO_INCREMENT COMMENT 'identificador da doação', AUTO_INCREMENT=10;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;

/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;

/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;


-- --------------------------------------------------------

--
-- Estrutura da tabela `funcionario`
--

DROP TABLE IF EXISTS `funcionario`;
CREATE TABLE `funcionario` (
  `cod_func` int(5) NOT NULL,
  `primeiro_nome_func` varchar(15) NOT NULL,
  `ultimo_nome_func` varchar(15) NOT NULL,
  `data_nasc_func` date NOT NULL,
  `cpf_func` varchar(14) NOT NULL,
  `id_endereco_func` int(5) NOT NULL,
  `telefone_func` varchar(11) NOT NULL,
  `email` varchar(40) NOT NULL,
  `gerente` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `funcionario`
--

INSERT INTO `funcionario` (`cod_func`, `primeiro_nome_func`, `ultimo_nome_func`, `data_nasc_func`, `cpf_func`, `id_endereco_func`, `telefone_func`, `email`, `gerente`) VALUES
(1, 'Karlla', 'Souza', '1994-12-27', '123.345.567-78', 1, '82996089546', 'karlla@hotmail.com', 1),
(2, 'Eike', 'Santiago', '1995-08-31', '098.876.654-43', 2, '82999302626', 'eike@hotmail.com', 0),
(3, 'Georgia', 'Demas', '1996-01-17', '234.567.890.12', 3, '82996947392', 'georgiademas@hotmail.com', 1),
(4, 'Felipe', 'Gualberto', '1992-04-06', '111.333.555-77', 4, '99623-9907', 'email.com', 0);


-- --------------------------------------------------------

--
-- Estrutura da tabela `enderecos_funcionarios`
--

DROP TABLE IF EXISTS `enderecos_funcionarios`;
CREATE TABLE `enderecos_funcionarios` (
  `id_endereco_func` int(11) DEFAULT NULL,
  `rua_func` varchar(30) DEFAULT NULL,
  `num_casa_func` int(11) DEFAULT NULL,
  `bairro_func` varchar(20) DEFAULT NULL,
  `cep_func` int(8) DEFAULT NULL,
  `cidade_func` varchar(20) DEFAULT NULL,
  `estado` varchar(15) DEFAULT NULL,
  `pais` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `enderecos_funcionarios`
--

INSERT INTO `enderecos_funcionarios` (`id_endereco_func`, `rua_func`, `num_casa_func`, `bairro_func`, `cep_func`, `cidade_func`, `estado`, `pais`) VALUES
(1, 'Rua Joana Darck', 285, 'Luziápolis', 57258000, 'Campo Alegre', 'Alagoas', 'Brasil'),
(2, NULL, NULL, 'Jacintinho', NULL, 'Maceió', 'Maceió', 'Brasil');


-- --------------------------------------------------------

--
-- Estrutura da tabela `patrimonio`
--

DROP TABLE IF EXISTS `patrimonio`;
CREATE TABLE `patrimonio` (
  `id_patrimonio` int(5) NOT NULL,
  `descricao_patrimonio` varchar(40) NOT NULL,
  `tipo_patrimonio` varchar(30) NOT NULL COMMENT 'patrimônio pode ser  líquido, bens móveis, bens tangíveis, bens imóveis, bens intangíveis, direitos, ou obrigações',
  `data_obtencao_patrimonio` date NOT NULL COMMENT 'data em que a ong recebeu esse patrimônio'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


--
-- Indexes for dumped tables
--

--
-- Indexes for table `atividades`
--
ALTER TABLE `atividades`
  ADD PRIMARY KEY (`id_atividade`);

--
-- Indexes for table `colaborador`
--
ALTER TABLE `colaborador`
  ADD PRIMARY KEY (`id_colaborador`);

--
-- Indexes for table `despesas`
--
ALTER TABLE `despesas`
  ADD PRIMARY KEY (`cod_despesa`);

--
-- Indexes for table `doacao`
--
ALTER TABLE `doacao`
  ADD PRIMARY KEY (`id_doador`);

--
-- Indexes for table `funcionario`
--
ALTER TABLE `funcionario`
  ADD PRIMARY KEY (`cod_func`),
  ADD KEY `cod_func` (`cod_func`,`primeiro_nome_func`,`ultimo_nome_func`,`data_nasc_func`,`cpf_func`,`id_endereco_func`,`telefone_func`,`email`,`gerente`);

--
-- Indexes for table `patrimonio`
--
ALTER TABLE `patrimonio`
  ADD PRIMARY KEY (`id_patrimonio`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `colaborador`
--
ALTER TABLE `colaborador`
  MODIFY `id_colaborador` int(6) NOT NULL AUTO_INCREMENT COMMENT 'código de identificação do colaborador', AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT for table `patrimonio`
--
ALTER TABLE `patrimonio`
  MODIFY `id_patrimonio` int(5) NOT NULL AUTO_INCREMENT;
