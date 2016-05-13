using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace WPFLab
{
    public class Jugador : INotifyPropertyChanged
    {
        public String Nombre { get; set; }
        public int Puntaje ;
        public Jugador()
        {

        }
        public event PropertyChangedEventHandler PropertyChanged;
    }
}
