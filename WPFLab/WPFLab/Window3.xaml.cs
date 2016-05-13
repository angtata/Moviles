using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Shapes;

namespace WPFLab
{
    /// <summary>
    /// Interaction logic for Window3.xaml
    /// </summary>
    public partial class Window3 : Window
    {
        public Window3()
        {
            List<String> colores = new List<string>(new string[] {"Red","Blue","AliceBlue","Aqua","Orange","Brown","BlueViolet", "Purple", "Red", "Blue", "AliceBlue", "Aqua", "Orange", "Brown", "BlueViolet", "Purple"});
            ViewModel v = new ViewModel();
            v.Cartas = new List<Carta>();
            v.Jugadores = new List<Jugador>();
            for(int j = 0; j<2; j++)
            {
                Jugador jug = new Jugador();
                jug.Nombre = "Jugador" + (j+1).ToString() ;
                jug.Puntaje = 0;
                v.Jugadores.Add(jug);
            }
            for(int i=0; i < 16; i++)
            {
                CardSelected comando = new CardSelected(v);
                Carta it = new Carta(comando);
                it.Color = colores[i];                           
                v.Cartas.Add(it);
            }
            this.DataContext = v;
            InitializeComponent();
        }

       
    }
}
