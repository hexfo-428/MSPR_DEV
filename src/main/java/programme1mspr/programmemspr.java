/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programme1mspr;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PradoxLeFox
 */
public class programmemspr {
 public static void main(String[] args) {
     
        //chemin du fichier
        String cheminStaff = "D:\\Xampp\\htdocs\\JAVA\\staff.txt";
        String path = "D:\\Xampp\\htdocs\\JAVA\\";
        try {
            //lire le fichier et recuperer la collection de personnes et on ecrit dans un fichier html
            String[] agents = lireFichierAgents(cheminStaff);

            for(String a : agents){
                Agent agent = lectureFichierAgent(path+a + ".txt");
                
                System.out.println(a);
                System.out.println(
                        "<tr><td>"+agent.getNom()+"</td><td>"+
                                   agent.getPrenom()+"</td><td>"+
                                   agent.getMission()+"</td></tr>"+
                                   agent.getMdp()+"</td></tr>"+
                                   agent.getObjet1()+"</td></tr>"+
                                   agent.getObjet2()+"</td></tr>"+
                                   agent.getObjet3()+"</td></tr>");
                        
            System.out.println("</table>");
            creerPageHTML(path, agent, a + ".html");
        } 
    } catch (IOException ex) {
         Logger.getLogger(programmemspr.class.getName()).log(Level.SEVERE, null, ex);
     }
      
 }
        

    public static void creerPageHTML(String path, Agent agent,String nomHTML) throws FileNotFoundException  {
        String nomFichierJpeg= (agent.getPrenom().substring(0,1)+agent.getNom()).toLowerCase();
        PrintWriter pw = new PrintWriter(path+ nomHTML);
        pw.println("<link href=\"D:\\Xampp\\htdocs\\ez.css\" rel=\"stylesheet\" type=\"text/css\"> <table>\n" +
" <link href=\"https://fr.allfont.net/allfont.css?fonts=roboto-light\" rel=\"stylesheet\" type=\"text/css\" /> \n" +
"<link href=\"https://fr.allfont.net/allfont.css?fonts=roboto-medium\" rel=\"stylesheet\" type=\"text/css\" /> \n" +            
"<div4 class='border-box'>" + nomFichierJpeg + "</div4>\n" +
 "<div style='text-align: right;'> <img src=\"D:\\Xampp\\htdocs\\JAVA\\"+nomFichierJpeg+".jpg\"> </div>" +     
"<tr> <th scope='row'>" + agent.getNom() + "</th> </tr> " +
"<tr> <th scope='row'>" + agent.getPrenom()  + "</th></tr>" +
"<tr> <th scope='row'>" + agent.getMission() +" </th> </tr>" +
"<tr> <th scope='row'>" + agent.getMdp()  + "</th> </tr>" +
"<tr> <th scope='row'>" + agent.getObjet1()  + "<div> <input type='checkbox' id='scales' name='scales' checked='checked'disabled> <label for='scales'></label>  </div>  </th> </tr> " +
"<tr> <th scope='row'>" + agent.getObjet2()  + "<div> <input type='checkbox' id='scales' name='scales' checked='checked'disabled> <label for='scales'></label>  </div>  </th> </tr>" +
"<tr> <th scope='row'>" + agent.getObjet3()  + "<div> <input type='checkbox' id='scales' name='scales' checked='checked'disabled> <label for='scales'></label>  </div>  </th> </tr>" +


              
                           
                           
      
        
        
     "</table>"
        
        
        );
        
        pw.close();
                                    
    }

private static String[] lireFichierAgents(String string) throws IOException {
BufferedReader br = new BufferedReader(new FileReader(string));
String[] contenu = new String[8];
int i = 0;
while (br.ready()) {
contenu[i] = br.readLine();
i++; }
br.close();
return contenu;
}


private static Agent lectureFichierAgent(String cheminstaff) throws IOException {
 List<String> lignes = new ArrayList<>();
BufferedReader br = new BufferedReader(new FileReader(cheminstaff));
while (br.ready()) {
lignes.add(br.readLine());
}
br.close();

Agent agent = new Agent(lignes.get(0), lignes.get(1), lignes.get(2), lignes.get(3), lignes.get(5), lignes.get(6), lignes.get(7));
return agent;
     
    }
}   
