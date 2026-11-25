package controllers;

import java.util.List;
import models.Incidente;

public class IncidenteController {
   
    public List<Incidente> sort(List<Incidente> incidentes) {
        // TODO S: ordenar la misma lista con List.sort y el orden natural; devolverla.
       incidentes.sort(null);
       return incidentes;
    }
    public int busquedaBinaria(List<Incidente> incidentes, Incidente objetivo) {
        // TODO B: implementar búsqueda binaria utilizando compareTo.
          incidentes.sort(null);
          int low = 0;
          int high = incidentes.size()-1;
 
          while (low <= high) {
            int mid = (low + high) / 2;

            if(incidentes.get(mid).compareTo(objetivo) == 0) {
                return mid;
            }
            if(incidentes.get(mid).compareTo(objetivo) < 0) {
                low = mid + 1;
            }else {
                high = mid - 1;
            }  

          }
          return -1; 

    }
}
