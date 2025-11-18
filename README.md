PADRÕES DE PROJETOS - AVALIAÇÃO SEMESTRAL
Valor: 5 pontos

Entrega: 18/11/2025, até 21h50 pelo Blackboard, impreterivelmente

Instruções: Responda às questões abaixo implementando as soluções solicitadas em Java. Armazene suas implementações em repositório de código e entregue o link para tal repositório.

Questão 1 (1 ponto)
Uma empresa de logística está desenvolvendo um sistema para criar diferentes tipos de relatórios operacionais (relatório diário, relatório semanal, relatório emergencial). Cada tipo de relatório possui regras específicas de preparação, como fontes de dados distintas, priorização de métricas e formatos diferentes. O time deseja projetar o sistema de forma que a criação dos relatórios possa ser estendida com novos tipos no futuro, sem alterar o núcleo do sistema. Implemente uma solução em Java que permita ao sistema delegar a criação dos relatórios a uma estrutura flexível, extensível e isolada por tipo de relatório. Sua solução conter dois tipos de relatórios e deve permitir adicionar novos relatórios sem modificar os existentes.

 
Questão 2 (1 ponto)
Uma plataforma de análise de investimentos precisa calcular o perfil de risco de clientes utilizando diferentes abordagens de cálculo (modelo agressivo, modelo moderado, modelo conservador). Cada abordagem utiliza fórmulas diferentes, pesos distintos e critérios próprios. O software deve permitir que o método de cálculo seja escolhido dinamicamente em tempo de execução, de acordo com o cliente ou conforme configurado por um consultor. Implemente uma solução em Java que permita alternar entre as diferentes lógicas de cálculo sem alterar o fluxo principal de análise, garantindo flexibilidade para adicionar novos modelos sem modificar os existentes.



Questão 3 (1 ponto)
Um sistema de monitoramento ambiental coleta dados em tempo real de sensores distribuídos em várias regiões (temperatura, umidade, índice de poluição). Sempre que um sensor atualiza seu valor, diversos módulos precisam ser notificados: um painel de controle, um módulo de alertas e um módulo de registro histórico.

Implemente uma solução em Java que permita que múltiplos módulos se inscrevam para receber atualizações automáticas dos sensores, garantindo baixo acoplamento e permitindo adicionar novos módulos observadores sem alterar o código existente dos sensores.



Questão 4 (1 ponto)
Um sistema antifraude para pagamentos online realiza uma cadeia de verificações antes de aprovar uma transação. Entre as verificações estão: análise de valor suspeito, análise de geolocalização, verificação de histórico do usuário e detecção de dispositivo incomum. Novos tipos de verificações devem poder ser adicionados futuramente sem modificar as verificações já existentes. A transação deve passar pela cadeia e ser barrada imediatamente ao falhar em qualquer etapa.

Implemente uma solução em Java que modele essa cadeia de verificações de forma flexível, permitindo criar, reorganizar ou estender a cadeia de validações sem alterar as etapas já implementadas.



Questão 5 (1 ponto)
Um sistema corporativo centraliza todos os logs de execução (erros, eventos e auditoria) em um único componente responsável por registrar informações em arquivo e enviá-las para um servidor externo de monitoramento. Esse componente deve existir em apenas uma instância em toda a aplicação, garantindo acesso global e prevenção de inconsistências decorrentes de múltiplas instâncias simultâneas.

Implemente uma solução em Java que assegure que o módulo de logging seja criado apenas uma vez e forneça um ponto de acesso global seguro à instância, incluindo tratamento adequado para ambientes multi-thread.
