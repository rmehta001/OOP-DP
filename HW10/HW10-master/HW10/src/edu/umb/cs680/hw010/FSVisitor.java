package edu.umb.cs680.hw010;

public interface FSVisitor {
	public void visit(ApfsLink link);
	public void visit(ApfsDirectory dir);
	public void visit(ApfsFile file);
}
