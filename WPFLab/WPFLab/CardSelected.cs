using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Input;

namespace WPFLab
{
    public class CardSelected : ICommand
    {
        public CardSelected(ViewModel view)
        {
            this.model = view;
        }
        private ViewModel model { get; set; }
        public event EventHandler CanExecuteChanged;
        private bool canExecute = true;

        public bool CanExecute(object parameter)
        { 
            
            return parameter==null || !((Carta)parameter).IsOpen;
        }

        public void Execute(object parameter)
        {
            Carta carta = (Carta)parameter;
            this.model.play(carta);
        }
    }
}
