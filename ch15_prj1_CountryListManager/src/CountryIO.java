import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CountryIO {

	private List<Country> countries = null;
	private Path countriesPath = null;
	private File countriesFile = null;
	private final String FIELD_SEP = "\t";
	
	public CountryIO() {
		countriesPath = Paths.get("countries.txt");
		countriesFile = countriesPath.toFile();
		countries = this.getAll();	
	}
	
	public List<Country> getAll() {
		// if countries file has already been read, don't do it again
		if (countries != null) {
			return countries;
		}
		else {
			countries = new ArrayList<>();
			
			if (Files.exists(countriesPath)) {
				try (BufferedReader in = new BufferedReader(
										 new FileReader(countriesFile))) {
					String line = in.readLine();
					while (line != null) {
						String[] fields = line.split(FIELD_SEP);
						String idStr = fields[0];
						String code = fields[1];
						String name = fields[2];
						int id = Integer.parseInt(idStr);
						Country country = new Country(id, code, name);
						countries.add(country);
						line = in.readLine();
					}
				}
				catch(IOException ioe) {
					System.out.println(ioe);
					return null;
				}
				return countries;
			}
			else {
				System.out.println(countriesPath.toAbsolutePath()+ " doesn't exist.");
				return null;
			}
		}
	}
	
	public boolean saveAll() {
		try (PrintWriter out = new PrintWriter(
							   new BufferedWriter(
							   new FileWriter(countriesFile)))) {
			//write all countries in the list to the file
			for (Country c: countries) {
				out.print(c.getId() + FIELD_SEP);
				out.print(c.getCode() + FIELD_SEP);
				out.println(c.getName());
			}
			return true;
		}
		catch(IOException ioe) {
			System.out.println(ioe);
			return false;
		}
	}
	
	public boolean add(Country country) {
		countries.add(country);
		return saveAll();
	}
	
	public boolean remove(Country country) {
		countries.remove(country);
		return saveAll();
	}
	
	public Country get(int id) {
		Country c = null;
		for (Country cnt: countries) {
			if (cnt.getId() == id) {
				c = cnt;
			}
		}
		return c;
	}
	
}
