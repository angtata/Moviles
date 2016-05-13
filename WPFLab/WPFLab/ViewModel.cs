using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace WPFLab
{
    public class ViewModel
    {
        public ViewModel()
        {
            selctCard = null;
        }
        
        public List<Carta> Cartas { get; set;}
        public List<Jugador> Jugadores { get; set; }
        private Carta selctCard { get; set; } 
        private Jugador actJugador { get; set; }
        int turno = 0;    
    
        public void play(Carta carta)
        {
            carta.IsOpen = !carta.IsOpen;
            if (selctCard == null)
            {
                selctCard = carta;
                actJugador = Jugadores[1];
            }
            else
            {
                
                if (!selctCard.Color.Equals(carta.Color))
                {
                    selctCard.IsOpen = !selctCard.IsOpen;
                    carta.IsOpen = !carta.IsOpen;
                    selctCard = null;
                    actJugador = Jugadores[(turno + 1) % Jugadores.Count()];
                }
                else
                {
                    actJugador.Puntaje = actJugador.Puntaje + 1;
                    selctCard = null;
                }
            }
        }
    }
}
