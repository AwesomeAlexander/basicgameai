package project;

public class Neuron {
	// Variables
	double value;
	double[] weights;
	
	// Constructors
	
	/**
	 * Default Constructor
	 * @param previous
	 */
	public Neuron(Layer previous) {
		this.value = Math.random();
		// TODO Randomize weights array
	}
	
	/**
	 * Initiates Neuron based off 2 parent Neurons
	 * @param parent1
	 * @param parent2
	 */
	public Neuron(Neuron parent1,Neuron parent2) {
		this.value = (Math.random()<0.5) ? parent1.value: parent2.value;
		// Equivalent to {@code if (Math.random() < 0.5) {this.neurons[i].value = parent1.neurons[i].value} else {this.neurons[i].value = parent2.neurons[i].value}}
		// ? : is essentially an if...else... statement
		
		// TODO Add in weight copying?
	}
	
	// Methods
	
	public void compute(Layer previous) {
		int sum = 0;
		for (int i=0;i<previous.neurons.length;i++) {
			sum += previous.neurons[i].value*weights[i];
		}
		
		// Sigmoid Function
		this.value = 1/(1+Math.pow(Math.E,-sum))
	}
}
