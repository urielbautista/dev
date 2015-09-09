package mx.umb.pattern.concurrency.join;

import java.util.ArrayList;
import java.util.List;

import mx.umb.pattern.concurrency.join.forkjoindecomposable.DecomposableInput;

public class ListOfProposals extends DecomposableInput<List<Proposal>> {

	public ListOfProposals(List<Proposal> proposals) {
		super(proposals);
	}

	@Override
	public boolean computeDirectly() {
		return rawInput.size()==1;
	}

	@Override
	public List<DecomposableInput<List<Proposal>>> decompose() {
		int split = rawInput.size() / 2;
		List<DecomposableInput<List<Proposal>>> decomposedListOfProposals = new ArrayList<>();
		decomposedListOfProposals.add(new ListOfProposals(rawInput.subList(0, split)));
		decomposedListOfProposals.add(new ListOfProposals(rawInput.subList(split, rawInput.size())));
		return decomposedListOfProposals;
	}

}