package model.entity;

import model.entity.base.BaseEntity;

import javax.persistence.*;

/**
 * @author gore
 * @date 2/13/14
 */

@Entity
@Table( name = "book" )
@SequenceGenerator( name = "seq", sequenceName = "seq_book" )
@AttributeOverrides( { @AttributeOverride( name = "id", column = @Column( name = "book_id" ) ),
		@AttributeOverride( name = "created", column = @Column( name = "book_created" ) ),
		@AttributeOverride( name = "modified", column = @Column( name = "book_modified" ) ) } )
public class Book extends BaseEntity
{
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn( name = "book_account_id" )
	private Account account;

	@ManyToOne
	@JoinColumn( name = "book_author_id" )
	private Author author;

	@ManyToOne
	@JoinColumn( name = "book_category_id" )
	private Category category;

	@ManyToOne
	@JoinColumn( name = "book_room_id" )
	private Room room;


	@Column( name = "book_name" )
	private String name;

	public Book()
	{
	}

	public Book( String name, Account account, Author author, Category category, Room room )
	{
		this.name = name;
		this.account = account;
		this.author = author;
		this.category = category;
		this.room = room;
	}

	public Account getAccount()
	{
		return this.account;
	}

	public void setAccount( Account account )
	{
		this.account = account;
	}

	public Author getAuthor()
	{
		return this.author;
	}

	public void setAuthor( Author author )
	{
		this.author = author;
	}

	public Category getCategory()
	{
		return this.category;
	}

	public void setCategory( Category category )
	{
		this.category = category;
	}

	public String getName()
	{
		return this.name;
	}

	public void setName( String name )
	{
		this.name = name;
	}

	public Room getRoom()
	{
		return this.room;
	}

	public void setRoom( Room room )
	{
		this.room = room;
	}
}
