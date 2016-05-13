using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Media;

namespace WPFLab
{
    public class Carta: INotifyPropertyChanged 
    {
        public Carta(CardSelected comando)
        {
            comand = comando;
        }
        public CardSelected comand { get; set;}
        private bool _IsOpen;
        public bool IsOpen {
            get { return _IsOpen; }
            set
            {
                _IsOpen = value;
                if (PropertyChanged != null)
                    PropertyChanged(this, new PropertyChangedEventArgs("Color"));
            }
                
        }

        private String color;

        public event PropertyChangedEventHandler PropertyChanged;

        public String Color
        {
            get
            {
                if (IsOpen)
                    return color;
                else
                    return "Gray";
            }
            set { color = value; }
        }

    }
}
