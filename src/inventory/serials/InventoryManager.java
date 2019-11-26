package inventory.serials;

import java.io.IOException;
import java.util.ArrayList;
import java.io.IOException;

import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import inventory.utiltiy.*;

public class InventoryManager 
{
	public static void main(String[] args) throws JsonMappingException, IOException {
		System.out.print("Hello Manager!!!");
		System.out.println(" Lets Add some inventory");
		System.out.println("How much inventory you want to add");
		String path = "/home/admin94/Desktop/FellowshipPrograms/OOPs/inventory_details.json";
		String oldFilePath = "/home/admin94/Desktop/FellowshipPrograms/OOPs/inventory_details_output.json";
		int num = Utility.integerInput();

		int choice;
		String name;
		int weight;
		int pricePerKg;
		int totalPriceOfWeight;
		int inventoryGrandTotal = 0;
		InventoryDetailModel model = new InventoryDetailModel();

		model = (InventoryDetailModel) JsonUtil.readMapper(oldFilePath, model);

		ArrayList<Rice> riceList = new ArrayList<Rice>();
		ArrayList<Pulses> pulsesList = new ArrayList<Pulses>();
		ArrayList<Wheat> wheatsList = new ArrayList<Wheat>();
		model.getRice().get(0)
				.setTotalPriceOfWeight(model.getRice().get(0).getWeight() * model.getRice().get(0).getPrice_per_kg());
		model.getPulses().get(0).setTotalPriceOfWeight(
				model.getPulses().get(0).getWeight() * model.getPulses().get(0).getPrice_per_kg());
		model.getWheats().get(0).setTotalPriceOfWeight(
				model.getWheats().get(0).getWeight() * model.getWheats().get(0).getPrice_per_kg());
		int riceSize = model.getRice().size();
		int pulsesSize = model.getPulses().size();
		int wheatsSize = model.getWheats().size();
		for (int i = 0; i <= model.getRice().size() - 1; i++) {
			inventoryGrandTotal += model.getRice().get(riceSize - 1).getTotalPriceOfWeight();
			riceSize--;
		}
		for (int i = 0; i <= model.getPulses().size() - 1; i++) {
			inventoryGrandTotal += model.getPulses().get(pulsesSize - 1).getTotalPriceOfWeight();
			pulsesSize--;
		}
		for (int i = 0; i <= model.getPulses().size() - 1; i++) {
			inventoryGrandTotal += model.getWheats().get(wheatsSize - 1).getTotalPriceOfWeight();
			wheatsSize--;
		}
		riceList.addAll(model.getRice());
		pulsesList.addAll(model.getPulses());
		wheatsList.addAll(model.getWheats());

		for (int i = 0; i < num; i++) {
			System.out.println("For adding press \n1. for rice\n2. for pulses\n3. for wheats: ");
			choice =Utility.integerInput();

			switch (choice) {
			case 1:
				Rice rice = new Rice();
				System.out.println("Enter name of brand: ");
				name = Utility.stringInput();
				System.out.println("Enter weight: ");
				weight = Utility.integerInput();
				System.out.println("Enter price per kg: ");
				pricePerKg = Utility.integerInput();
				totalPriceOfWeight = weight * pricePerKg;

				inventoryGrandTotal += totalPriceOfWeight;

				rice.setName(name);
				rice.setWeight(weight);
				rice.setPrice_per_kg(pricePerKg);
				rice.setTotalPriceOfWeight(totalPriceOfWeight);

				riceList.add(rice);
				break;
			case 2:
				Pulses pulses = new Pulses();
				System.out.println("Enter name of brand: ");
				name = Utility.stringInput();
				System.out.println("Enter weight: ");
				weight = Utility.integerInput();
				System.out.println("Enter price per kg: ");
				pricePerKg = Utility.integerInput();
				totalPriceOfWeight = weight * pricePerKg;

				inventoryGrandTotal += totalPriceOfWeight;

				pulses.setName(name);
				pulses.setWeight(weight);
				pulses.setPrice_per_kg(pricePerKg);
				pulses.setTotalPriceOfWeight(totalPriceOfWeight);

				pulsesList.add(pulses);

				break;
			case 3:
				Wheat wheats = new Wheat();
				System.out.println("Enter name of brand: ");
				name = Utility.stringInput();
				System.out.println("Enter weight: ");
				weight =Utility.integerInput();
				System.out.println("Enter price per kg: ");
				pricePerKg = Utility.integerInput();
				totalPriceOfWeight = weight * pricePerKg;

				inventoryGrandTotal += totalPriceOfWeight;

				wheats.setName(name);
				wheats.setWeight(weight);
				wheats.setPrice_per_kg(pricePerKg);
				wheats.setTotalPriceOfWeight(totalPriceOfWeight);

				wheatsList.add(wheats);

				break;
			default:
				System.out.println("Please select valid option!!");
				continue;
			}

		}

		model.setTotal(inventoryGrandTotal);
		model.setRice(riceList);
		model.setPulses(pulsesList);
		model.setWheats(wheatsList);

		System.out.println(JsonUtil.writeMapper(path, model));
		System.out.println("Inventory is added into new json File");

	}

}