package coffeeShop.dataAccess.concretes.hibernateImpls;

import java.util.ArrayList;
import java.util.List;

import coffeeShop.dataAccess.abstracts.CampaignRepository;
import coffeeShop.entities.concretes.Campaign;

public class HibernateCampaignRepository implements CampaignRepository {
	private List<Campaign> list;
	public HibernateCampaignRepository() {
		list = new ArrayList<Campaign>();	
		}

	@Override
	public void add(Campaign campaign) {
		list.add(campaign);
		
	}

	@Override
	public void update(Campaign campaign) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Campaign campaign) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Campaign> getAll() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Campaign getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
