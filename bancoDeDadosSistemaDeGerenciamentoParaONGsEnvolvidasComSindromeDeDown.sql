
/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `gerenciamento de ongs envolvidas com síndrome de down`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `atividades`
--

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
(1, 'Karlla Souza', '123.456.789.01', 'karlladanielly94@hotmail.com', '996089546', 0, 'Luziápolis - Campo Alegre / AL'),
(3, 'Diogo Figueredo', '123.456.789-01', 'diogofb.93@hotmail.com', '998010348', 0, 'Ponta Verde - Maceió / AL'),
(5, 'Diego Henrique Melo', '986.356.345-60', 'diegomelo.90@hotmail.com', '981905902', 1, 'Maceió/AL');

-- --------------------------------------------------------

--
-- Estrutura da tabela `despesas`
--

CREATE TABLE `despesas` (
  `cod_despesa` int(5) NOT NULL,
  `descricao` varchar(40) NOT NULL,
  `valor` double NOT NULL,
  `data_vencimento_despesa` date NOT NULL,
  `data_pagamento_despesa` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `doacao`
--

CREATE TABLE `doacao` (
  `id_doador` int(6) UNSIGNED NOT NULL COMMENT 'código para identificação de doador',
  `valor_doacao` double NOT NULL COMMENT 'valor que foi doado',
  `data_doacao` date NOT NULL COMMENT 'data da doação'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `enderecos_funcionarios`
--

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

-- --------------------------------------------------------

--
-- Estrutura da tabela `funcionario`
--

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
(2, 'Eike', 'Santiago', '1995-08-31', '098.876.654-43', 2, '82999302626', 'eike@hotmail.com', 0);

-- --------------------------------------------------------

--
-- Estrutura da tabela `patrimonio`
--

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
  MODIFY `id_colaborador` int(6) NOT NULL AUTO_INCREMENT COMMENT 'código de identificação do colaborador', AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `doacao`
--
ALTER TABLE `doacao`
  MODIFY `id_doador` int(6) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'código para identificação de doador';
--
-- AUTO_INCREMENT for table `patrimonio`
--
ALTER TABLE `patrimonio`
  MODIFY `id_patrimonio` int(5) NOT NULL AUTO_INCREMENT;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;