package controller;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author gore
 * @date 2/13/14
 */

public class Libria
{
	public static void main( String[] args )
	{
		final JFrame frame = new JFrame( "Main Window" );
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		frame.setPreferredSize( new Dimension( 800, 600 ) );
		frame.getContentPane().add( new JLabel( "Welcome to Libria" ), BorderLayout.NORTH );
		JButton button = new JButton( "Close" );

		JPanel buttonsPanel = new JPanel( new BorderLayout() );
		buttonsPanel.add( button, BorderLayout.EAST );

		button.addActionListener( new ActionListener()
		{
			@Override
			public void actionPerformed( ActionEvent e )
			{
				frame.dispose();
			}
		} );

		frame.getContentPane().add( buttonsPanel, BorderLayout.SOUTH );
		frame.pack();
		frame.setVisible( true );
	}
}
