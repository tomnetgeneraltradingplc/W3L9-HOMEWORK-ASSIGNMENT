package Problem_2;
public class MyTable {
	Entry[] entries = new Entry[26];
	public String get(char c){
		Entry e = entries[computeIndex(c)];
		return e.s;
	}
	public void add(char c, String s){
		int index = computeIndex(c);
		entries[index] = new Entry(c,s);
	}
	private int computeIndex(char c){
		return (int)c - 97;
	}
	private char computeChar(int d){
		return (char)(d+97);
	}
	public String toString() {
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < 26; ++i){
			if(entries[i] != null) {
				sb.append(entries[i].toString());
				sb.append(System.getProperty("line.separator"));
			}
		}
		return sb.toString();
	}
	

	public static void main(String[] args){
		MyTable t = new MyTable();
		t.add('a', "Andrew");
		t.add('b',"Billy");
		t.add('c', "Andrew");
		t.add('d',"Dani");
		t.add('e',"Ellen");
		t.add('f', "Ferdinald");
		t.add('g',"Grezima");
		t.add('h', "Habtamu");
		t.add('i',"Illuye");
		t.add('j',"Jully");
		t.add('k', "Kalibe");
		t.add('l',"Luise");
		t.add('m', "Mohhamed");
		t.add('n',"Nohawit");
		t.add('o',"Ophera");
		t.add('p', "Parize");
		t.add('q',"Qulumo");
		t.add('r', "Ralli");
		t.add('s',"Solomon");
		t.add('t',"Tope");
		t.add('u',"Uniti");
		t.add('v',"Vavid");
		t.add('w',"Willie");
		t.add('x',"Xoxo");
		t.add('y',"Yali");
		t.add('z',"Zugue");
		System.out.println(t);
		System.out.println("Return String matched with char b : "+ t.get('b'));
		System.out.println("Return String matched with char t : "+ t.get('t'));
		
		
	}
	private class Entry {
		
		char c;
		String s;

		Entry(char c, String s){
			this.c = c;
			this.s = s;
		}
		public String toString(){
			return(""+ c + "->"+ s);
		}
		
		
	}
	

}
/*
Output
a->Andrew
b->Billy
c->Andrew
d->Dani
e->Ellen
f->Ferdinald
g->Grezima
h->Habtamu
i->Illuye
j->Jully
k->Kalibe
l->Luise
m->Mohhamed
n->Nohawit
o->Ophera
p->Parize
q->Qulumo
r->Ralli
s->Solomon
t->Tope
u->Uniti
v->Vavid
w->Willie
x->Xoxo
y->Yali
z->Zugue

Return String matched with char b : Billy
Return String matched with char t : Tope
*/