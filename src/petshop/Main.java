package petshop;

public class Main {

	public static void main(String[] args) {
		System.out.println("Lista de serviços disponíveis no petshop:");

        for (ServiceType service : ServiceType.values()) {
            System.out.println("- " + service.getDescription());
        }

        // Exemplo: Selecionar alguns serviços
        SelectedServices selected = new SelectedServices();

        selected.addService(ServiceType.BATH);
        selected.addService(ServiceType.TEETH_BRUSHING);
        selected.addService(ServiceType.VACCINATION);

        System.out.println("\nServiços selecionados pelo cliente:");
        
        // service.name() retorna o nome da constante (ex: TEETH_BRUSHING)
        // service.getDescription() retorna o nome legível (ex: "Teeth Brushing")
        for (ServiceType service : selected.getServices()) {
            System.out.println("- " + service.getDescription());
        }

        // Verificando se um serviço está selecionado
        if (selected.hasService(ServiceType.BATH)) {
            System.out.println("\nO cliente selecionou banho.");
        } else {
            System.out.println("\nO cliente não selecionou banho.");
        }
		
	}

}
