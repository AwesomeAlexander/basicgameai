package project;

public class Layer {
	// Variables
	Neuron[] neurons;
	
	// Constructors
	
	/**
	 * Default Constructor
	 */
	public Layer() {
		
	}
	
	/**
	 * Initiates layer based off 2 parent Layers
	 * @param parent1
	 * @param parent2
	 */
	public Layer(Layer parent1,Layer parent2) {
		// Throw error if the parents aren't the same size
		if (parent1.neurons.length != parent2.neurons.length) {throw new IllegalArgumentException("Both Parent Layers have to be the same size!");}
		
		// Copies the neurons of the parents
		this.neurons = new Neuron[parent1.neurons.length];
		// Loops through the neurons
		for (int i=0;i<this.neurons.length;i++) {
			this.neurons[i] = new Neuron(parent1.neurons[i],parent2.neurons[i]);
		}
	}
	
	// Methods
	
	public void compute(Layer previous) {
		// Computes the layer based off of the previous one
	}
}
