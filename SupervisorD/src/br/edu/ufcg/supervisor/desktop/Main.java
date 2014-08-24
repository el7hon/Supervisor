/**
 * Copyright 2013-2014 Marcos Ferreira and Elthon Oliveira
 * 
 * This file is part of SupervisorD for Healthcare Professional software.
 * 
 *  SupervisorD for Healthcare Professional is free software: you can 
 *  redistribute it and/or modify it under the terms of the GNU General 
 *  Public License as published by the Free Software Foundation, either 
 *  version 3 of the License, or (at your option) any later version.
 *  
 *  SupervisorD for Healthcare Professional is distributed in the hope that
 *  it will be useful, but WITHOUT ANY WARRANTY; without even the implied 
 *  warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See 
 *  the GNU General Public License for more details.
 *  You should have received a copy of the GNU General Public License
 *  along with SupervisorD for Healthcare Professional. 
 *  If not, see <http://www.gnu.org/licenses/>.
 */package br.edu.ufcg.supervisor.desktop;

 import br.edu.ufcg.supervisor.desktop.windows.WindowsManager;
/**
 * Classe responsável por inicializar a aplicação com as telas menos elaboradas, quadradas, rudimentares. 
 * @author Marcos José, Elthon Oliveira
 *
 */
public class Main {

	public static void main(String[] args) {
		new WindowsManager().initListaAtributos();
	}
}
